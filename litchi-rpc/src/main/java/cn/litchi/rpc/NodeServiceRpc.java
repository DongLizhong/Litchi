package cn.litchi.rpc;


import cn.litchi.model.entity.Node;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "litchi-data-server")
@RequestMapping("/node")
public interface NodeServiceRpc {
	@GetMapping("/list")
	List<Node> selectNodeList();
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	Boolean addNode(@RequestBody Node node);
	@GetMapping(value = "/delete")
	Boolean deleteNode(@RequestParam("nodeId") Long nodeId);
}
