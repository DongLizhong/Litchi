package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.model.DBLzNode;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.NodeServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/node")
public class NodeController extends BaseController{
	
	@Autowired
	private NodeServiceRpc nodeService;

	@GetMapping("/list")
	public MallResult getNodeList(){
		List<DBLzNode> nodes =  nodeService.getNodeList();
		List<Long> idList = new ArrayList<Long>();
		if(nodes.isEmpty()){
			return MallResult.ok();
		}
		nodes.forEach(it -> idList.add(it.getId()));
		return MallResult.ok(idList);
	}
	
	@DeleteMapping("")
	public MallResult deleteNode(Long nodeId) {
		System.out.println("nodeId = "+ nodeId);
		 return nodeService.deleteNode(nodeId) ? MallResult.ok() : MallResult.build(401,"删除失败");
	}
	
	@PostMapping("")
	public MallResult addNode(@RequestBody DBLzNode node){
		return  nodeService.addNode(node) ? MallResult.ok() : MallResult.build(401,"添加失败");
	}
	
}
