package cn.litchi.rpc;


import cn.litchi.model.entity.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@FeignClient(value = "litchi-data-server")
@RequestMapping("/node/data")
public interface NodeDataServiceRpc {
	@GetMapping("")
	List<Data> selectDatasByNodeId(@RequestParam("nodeId") Long nodeId);
	/*
	 * 获取最近N天的目标节点数据
	 */
	@GetMapping("/lastday")
	List<Data> selectLastestNDayDatasByNodeId(@RequestParam("nodeId") Long nodeId,
                                              @RequestParam("nday") int nday);
	@GetMapping("/interval")
	List<Data> selectIntervalDatasByDateAndNodeId(@RequestParam("beginDate") Date beginDate,
                                                  @RequestParam("endDate") Date endDate,
                                                  @RequestParam("nodeId") Long nodeId);
}
