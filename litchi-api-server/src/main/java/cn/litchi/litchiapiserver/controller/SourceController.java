package cn.litchi.litchiapiserver.controller;

import cn.litchi.litchiapiserver.entity.GroupCarouselPicEntity;
import cn.litchi.litchiapiserver.entity.Picture;
import cn.litchi.model.entity.LzLitchiType;
import cn.litchi.model.entity.LzOrcpicture;
import cn.litchi.model.entity.LzText;
import cn.litchi.model.entity.TbContent;
import cn.litchi.model.utils.CheckToken;
import cn.litchi.model.utils.MallResult;
import cn.litchi.model.utils.MallResultStatus;
import cn.litchi.rpc.SourceServiceRpc;
import com.alibaba.druid.sql.PagerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/source")
public class SourceController extends BaseController {

    @Autowired
    private SourceServiceRpc sourceServiceRpc;

    @PostMapping("/file")
    public MallResult uploadFile(@PathParam("file") MultipartFile file) {
        Map<String, String> map = sourceServiceRpc.uploadFile(file);
        if (map == null || map.isEmpty()) {
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "文件上传失败");
        }
        Iterator iterator = map.keySet().iterator();
        if (iterator.hasNext()) {
            return MallResult.ok(map.get(iterator.next()));
        }
        return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "文件上传失败");
    }

    @GetMapping("/litchi/carouselpic")
    public MallResult getLitchiCarouselPic() {
        List<TbContent> list = sourceServiceRpc.getCarouselPic();
        if (list == null) {
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "荔枝园轮播图获取失败");
        }
        List<Picture> data = new ArrayList<>();
        for (TbContent content : list) {
            Picture picture = new Picture();
            picture.setPic(content.getPic());
            picture.setTitle(content.getTitle());
            picture.setUrl(content.getUrl());
            data.add(picture);
        }
        return MallResult.ok(data);
    }

    @GetMapping("/litchi/orcpic")
    public MallResult getOrcPicByOrcId(@RequestParam(value = "orcId", defaultValue = "1") Long orcId) {
        List<LzOrcpicture> data = sourceServiceRpc.getOrcPic(orcId);
        if (data == null) {
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "荔枝园图片获取失败");
        }
        return MallResult.ok(data);
    }

    @GetMapping("/litchi/wisdommanagement")
    public MallResult getWisdommanagement(@RequestParam(value = "typeId", defaultValue = "1") Long typeId,Integer mon) {
        LzLitchiType data = sourceServiceRpc.getLitchiType(typeId);
        if(data == null){
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "智慧管理获取失败");
        }
        String management = null;
        switch (mon.intValue()){
            case 1:
                management = data.getJan();
                break;
            case 2:
                management = data.getFeb();
                break;
            case 3:
                management = data.getMar();
                break;
            case 4:
                management = data.getApr();
                break;
            case 5:
                management = data.getMay();
                break;
            case 6:
                management = data.getJun();
                break;
            case 7:
                management = data.getJul();
                break;
            case 8:
                management = data.getAug();
                break;
            case 9:
                management = data.getSept();
                break;
            case 10:
                management = data.getOct();
                break;
            case 11:
                management = data.getNov();
                break;
            case 12:
                management = data.getDece();
                break;
            default :

        }
        return (management != null) ? MallResult.ok(management)
                : MallResult.build(MallResultStatus.Server_OPERATION_FAIL,"参数错误");
    }

    @GetMapping("/litchi/text")
    public MallResult getLitchiCulture(Long typeId){
        List<LzText> data = sourceServiceRpc.getLitchiTextByTypeId(typeId);
        if(data == null){
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "信息获取失败");
        }
        return MallResult.ok(data);
    }

    @GetMapping("/litchi/carouselpic/group")
    public MallResult  getLitchiCarouselGroupPic(){
        List<LzText> data = sourceServiceRpc.getLitchiTextByTypeId(Long.valueOf(7));
        if(data == null){
            return MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "信息获取失败");
        }
        GroupCarouselPicEntity[][] dataArray = getArrayByList(data);
        return MallResult.ok(dataArray);
    }

    private GroupCarouselPicEntity[][] getArrayByList(List<LzText> listDatas) {
        int dataSize = listDatas.size();
        GroupCarouselPicEntity[][] datas = new GroupCarouselPicEntity[(int) Math.ceil(dataSize/2.0)][2];
        Iterator<LzText> iterator = listDatas.iterator();
        int row = 0;
        int col = 0;
        while (iterator.hasNext()) {
            LzText data = iterator.next();
            datas[row][col] = new GroupCarouselPicEntity(data.getTitle(),data.getPic());
            col = (col == 1) ? 0 : 1;
            if(col == 0){
                row ++;
            }
        }
        return datas;
    }

}