package cn.litchi.litchisourceserver.service;

import cn.litchi.litchisourceserver.mapper.LzLitchiTypeMapper;
import cn.litchi.litchisourceserver.mapper.LzOrcpictureMapper;
import cn.litchi.litchisourceserver.mapper.LzTextMapper;
import cn.litchi.litchisourceserver.mapper.TbContentMapper;
import cn.litchi.model.entity.*;
import cn.litchi.model.utils.FastDFSClient;
import cn.litchi.rpc.SourceServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SourceService implements SourceServiceRpc {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    @Value("${litchi.content.category.carousepicId}")
    private Long carouselPicId;

    @Autowired
    private TbContentMapper contentMapper;

    @Autowired
    private LzOrcpictureMapper orcpictureMapper;

    @Autowired
    private LzLitchiTypeMapper lzLitchiTypeMapper;

    @Autowired
    private LzTextMapper lzTextMapper;

    @Override
    public List<TbContent> getCarouselPic() {
        List<TbContent> list = getContentListByCategoryId(carouselPicId);
        return list;

    }

    @Override
    public Map<String,String> uploadFile(@RequestPart("file") MultipartFile uploadFile) {
        try {
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
            //取文件扩展名
            String originalFilename = uploadFile.getOriginalFilename();
            String key = uploadFile.getName();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
            //得到一个图片地址和文件名
            String url = fastDFSClient.uploadFile(uploadFile.getBytes(),extName);
            //补充为完整的url
            url = IMAGE_SERVER_URL + url;
            Map<String,String> map = new HashMap<>();
            //图片原来的名字为key,url为value
            map.put(key,url);
            return map;

        } catch (Exception e) {
            Map result = new HashMap<>();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<LzOrcpicture> getOrcPic(Long orcId) {
        LzOrcpictureExample example = new LzOrcpictureExample();
        LzOrcpictureExample.Criteria criteria = example.createCriteria();
        criteria.andOrcIdEqualTo(orcId);
        List<LzOrcpicture> data = orcpictureMapper.selectByExample(example);
        return data;
    }

    @Override
    public LzLitchiType getLitchiType(Long typeId) {
        return lzLitchiTypeMapper.selectByPrimaryKey(typeId);
    }

    @Override
    public List<LzText> getLitchiTextByTypeId(Long typeId) {
        LzTextExample example = new LzTextExample();
        LzTextExample.Criteria criteria = example.createCriteria();
        criteria.andTIdEqualTo(typeId);
        return lzTextMapper.selectByExample(example);
    }

    private List<TbContent> getContentListByCategoryId(Long categoryId){
        TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(categoryId);
        List<TbContent> list = contentMapper.selectByExample(example);
        return list;
    }
}
