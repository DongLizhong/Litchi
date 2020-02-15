package cn.litchi.litchidataserver.service;

import cn.litchi.litchidataserver.mapper.HarmMapper;
import cn.litchi.model.entity.Harm;
import cn.litchi.model.entity.HarmExample;
import cn.litchi.rpc.HarmServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HarmServiceImpl implements HarmServiceRpc{
	
	@Autowired
	private HarmMapper harmMapper;

	@Override
	public List<Harm> getHarmList(String type) {
		HarmExample example = new HarmExample();
		HarmExample.Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		List<Harm> list = harmMapper.selectByExample(example);
		return list;
	}

	@Override
	public Harm getHarmById(Long id) {
		Harm harm = harmMapper.selectByPrimaryKey(id);
		return harm;
	}


	@Override
	public Boolean addHarm(Harm harm) {
		int num = harmMapper.insert(harm);
		if(num == 1){
			return true;
		}else {
			return false;
		}
	}

}
