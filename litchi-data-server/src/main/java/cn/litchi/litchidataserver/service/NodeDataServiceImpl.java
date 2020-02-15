package cn.litchi.litchidataserver.service;

import cn.litchi.litchidataserver.mapper.DataMapper;
import cn.litchi.model.entity.Data;
import cn.litchi.model.entity.DataExample;
import cn.litchi.rpc.NodeDataServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class NodeDataServiceImpl implements NodeDataServiceRpc {
	
	@Autowired
	private DataMapper dataMapper;

	@Override
	public List<Data> selectDatasByNodeId(Long nodeId) {
		DataExample example = new DataExample();
		DataExample.Criteria criteria = example.createCriteria();
		criteria.andNIdEqualTo(nodeId);
		List<Data> datas = dataMapper.selectByExample(example);
		return datas;
	}

	@Override
	public List<Data> selectLastestNDayDatasByNodeId(Long nodeId, int nday) {
		DataExample example = new DataExample();
		DataExample.Criteria criteria = example.createCriteria();
		criteria.andNIdEqualTo(nodeId);
		Date date = new Date();
		criteria.andTimeGreaterThanOrEqualTo(getDateOffset(date, nday));
		List<Data> datas = dataMapper.selectByExample(example);
		return datas;
	}

	@Override
	public List<Data> selectIntervalDatasByDateAndNodeId(Date beginDate,Date endDate,Long nodeId){
		DataExample example = new DataExample();
		DataExample.Criteria criteria = example.createCriteria();
		criteria.andTimeBetween(beginDate, endDate);
		criteria.andNIdEqualTo(nodeId);
		List<Data> list = dataMapper.selectByExample(example);
		return list;
	}
	
	/**
	 * 获取源日期前或后 day 天的日期
	 * <p>@param date 源日期
	 * <p>@param day 偏移天数，前用负数表示，后用正数表示
	 * <p>@return</p> 目标日期
	 */
	private Date getDateOffset(Date date,int day){
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE,now.get(Calendar.DATE)+day);
		return now.getTime();
	}


}
