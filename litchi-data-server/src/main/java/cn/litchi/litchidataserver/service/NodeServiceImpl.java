package cn.litchi.litchidataserver.service;

import cn.litchi.litchidataserver.mapper.NodeMapper;
import cn.litchi.model.entity.Node;
import cn.litchi.model.entity.NodeExample;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.NodeServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NodeServiceImpl implements NodeServiceRpc {
	
	@Autowired
	private NodeMapper nodeMapper;

	@Override
	public List<Node> selectNodeList() {
		NodeExample example = new NodeExample();
		List<Node> list = nodeMapper.selectByExample(example);
		return list;
	}

	@Override
	public Boolean addNode(@RequestBody Node node) {
		System.out.println(node.toString());
		return (nodeMapper.insert(node) == 1) ? true : false;

	}

	@Override
	public Boolean deleteNode(Long nodeId) {
		NodeExample example = new NodeExample();
		NodeExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(nodeId);
		return (nodeMapper.deleteByExample(example) == 1) ? true : false;
	}
	

}
