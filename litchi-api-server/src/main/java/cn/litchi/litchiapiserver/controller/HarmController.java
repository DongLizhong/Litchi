package cn.litchi.litchiapiserver.controller;

import cn.litchi.litchiapiserver.entity.SimpleHarm;
import cn.litchi.model.entity.Harm;
import cn.litchi.model.utils.MallResult;
import cn.litchi.model.utils.MallResultStatus;
import cn.litchi.rpc.HarmServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/harm")
public class HarmController extends BaseController {

    @Autowired
    private HarmServiceRpc harmService;

    @GetMapping("/list")
    // type == "1" 虫害 “2” 病害
    public MallResult getHarmList(String type) {
        List<Harm> list = harmService.getHarmList(type);
        List<SimpleHarm> simpleHarmList = new ArrayList<SimpleHarm>();
        if (list == null || list.size() <= 0) {
            return MallResult.build(401, "无数据");
        } else {
            Iterator<Harm> iterator = list.iterator();
            while (iterator.hasNext()) {
                Harm tempHarm = iterator.next();
                SimpleHarm simpleHarm = new SimpleHarm(tempHarm.getId(), tempHarm.getPic(), tempHarm.getName());
                simpleHarmList.add(simpleHarm);
            }
            return MallResult.ok(simpleHarmList);
        }
    }

    @GetMapping("")
    public MallResult getHarmById(Long id) {
        Harm harm = harmService.getHarmById(id);
        return (harm == null) ? MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "查询失败")
                : MallResult.ok(harm);
    }

    @PostMapping("/add")
    public MallResult addHarm(@RequestBody Harm harm) {
        Boolean result = harmService.addHarm(harm);
        return result ? MallResult.ok() : MallResult.build(MallResultStatus.Server_OPERATION_FAIL, "添加失败");
    }
}
