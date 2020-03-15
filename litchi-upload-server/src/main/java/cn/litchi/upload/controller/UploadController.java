package cn.litchi.upload.controller;

import cn.litchi.model.mapper.LzNodeDataDao;
import cn.litchi.model.mapper.LzNodeDataPictureDao;
import cn.litchi.model.model.DBLzNodeData;
import cn.litchi.model.model.DBLzNodeDataPicture;
import cn.litchi.model.utils.DateUtils;
import cn.litchi.model.utils.MallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Autowired
    private LzNodeDataDao nodeDataDao;
    @Autowired
    private LzNodeDataPictureDao pictureDao;

    @PostMapping("/data")
    public MallResult uploadNodeData(@RequestBody DBLzNodeData nodeData) {
        if (true) {
            // TODO 检查token判断权限以及节点号
            nodeData.setNodeId(1L);
        }
        if (nodeData.getTime() == null) {
            nodeData.setTime(DateUtils.getNowTimeAsEpochMilli());
        }
        nodeDataDao.insert(nodeData);
        return MallResult.ok();
    }

    @PostMapping("/data/picture")
    public MallResult uploadNodePicture(@RequestBody DBLzNodeDataPicture nodeData) {
        if (true) {
            // TODO 检查token判断权限以及节点号
            nodeData.setNodeId(1L);
        }
        if (nodeData.getTime() == null) {
            nodeData.setTime(DateUtils.getNowTimeAsEpochMilli());
        }
        pictureDao.insert(nodeData);
        return MallResult.ok();
    }
}
