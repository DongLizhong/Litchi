package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.entity.Node;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.NodeServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/node")
public class NodeController extends BaseController{
	
	@Autowired
	private NodeServiceRpc nodeService;

	@GetMapping("/list")
	public MallResult getNodeList(){
		List<Node> nodes =  nodeService.selectNodeList();
		List<Long> idList = new ArrayList<Long>();
		if(nodes.isEmpty()){
			return MallResult.ok();
		}
		Iterator<Node> iterator = nodes.iterator();
		while (iterator.hasNext()) {
			Node tempNode = iterator.next();
			Long id = tempNode.getId();
			idList.add(id);
		}
		return MallResult.ok(idList);
	}
	
	@DeleteMapping("")
	public MallResult deleteNode(Long nodeId) {
		System.out.println("nodeId = "+ nodeId);
		 return nodeService.deleteNode(nodeId) ? MallResult.ok() : MallResult.build(401,"删除失败");
	}
	
	@PostMapping("")
	public MallResult addNode(@RequestBody Node node){
		System.out.println(node.toString());
		return  nodeService.addNode(node) ? MallResult.ok() : MallResult.build(401,"添加失败");
	}
	
}
