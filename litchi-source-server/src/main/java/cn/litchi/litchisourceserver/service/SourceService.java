package cn.litchi.litchisourceserver.service;

import cn.litchi.model.mapper.LzLitchiTypeDao;
import cn.litchi.model.mapper.LzOrcpictureDao;
import cn.litchi.model.mapper.LzTextDao;
import cn.litchi.model.mapper.TbContentDao;
import cn.litchi.model.model.LzLitchiType;
import cn.litchi.model.model.LzOrcpicture;
import cn.litchi.model.model.LzText;
import cn.litchi.model.model.TbContent;
import cn.litchi.model.utils.FastDFSClient;
import cn.litchi.rpc.SourceServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;

@RestController
public class SourceService implements SourceServiceRpc {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    @Value("${litchi.content.category.carousepicId}")
    private Long carouselPicId;

    @Autowired
    private TbContentDao contentMapper;

    @Autowired
    private LzOrcpictureDao orcpictureMapper;

    @Autowired
    private LzLitchiTypeDao lzLitchiTypeMapper;

    @Autowired
    private LzTextDao lzTextMapper;

    @Override
    public List<TbContent> getCarouselPic() {
        List<TbContent> list = getContentListByCategoryId(carouselPicId);
        return list;

    }

    @Override
    public Map<String, String> uploadFile(@RequestPart("file") MultipartFile uploadFile) {
        try {
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
            //取文件扩展名
            String originalFilename = uploadFile.getOriginalFilename();
            String key = uploadFile.getName();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            //得到一个图片地址和文件名
            String url = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
            //补充为完整的url
            url = IMAGE_SERVER_URL + url;
            Map<String, String> map = new HashMap<>();
            //图片原来的名字为key,url为value
            map.put(key, url);
            return map;

        } catch (Exception e) {
            Map result = new HashMap<>();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<LzOrcpicture> getOrcPic(Long orcId) {
        QueryWrapper<LzOrcpicture> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(LzOrcpicture.ORCHARD_ID_FIELD, orcId);
        List<LzOrcpicture> data = orcpictureMapper.selectList(queryWrapper);
        return checkListNotNull(data);
    }

    @Override
    public LzLitchiType getLitchiType(Long typeId) {
        return lzLitchiTypeMapper.selectById(typeId);
    }

    @Override
    public List<LzText> getLitchiTextByTypeId(Long typeId) {
        QueryWrapper<LzText> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(LzText.TEXT_TYPE_ID_FIELD, typeId);
        List<LzText> data = lzTextMapper.selectList(queryWrapper);
        return checkListNotNull(data);
    }

    private List<TbContent> getContentListByCategoryId(Long categoryId) {

        QueryWrapper<TbContent> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(TbContent.CATEGORY_ID_FIELD, categoryId);
        List<TbContent> datas = contentMapper.selectList(queryWrapper);
        return checkListNotNull(datas);
    }
}
