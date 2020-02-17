package cn.litchi.rpc;


import cn.litchi.model.model.LzNodeData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@FeignClient(value = "litchi-data-server")
@RequestMapping("/node/data")
public interface NodeDataServiceRpc {
	@GetMapping("")
	List<LzNodeData> selectDatasByNodeId(@RequestParam("nodeId") Long nodeId);
	/*
	 * 获取最近N天的目标节点数据
	 */
	@GetMapping("/lastday")
	List<LzNodeData> selectLastestNDayDatasByNodeId(@RequestParam("nodeId") Long nodeId,
													@RequestParam("nday") int nday);
	@GetMapping("/interval")
	List<LzNodeData> selectIntervalDatasByDateAndNodeId(@RequestParam("beginDate") LocalDate beginDate,
                                                  @RequestParam("endDate") LocalDate endDate,
                                                  @RequestParam("nodeId") Long nodeId);
}
