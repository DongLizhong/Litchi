package cn.litchi.litchiapiserver.controller;

import cn.litchi.litchiapiserver.entity.MyNodeData;
import cn.litchi.litchiapiserver.entity.NodeIdAndDateList;
import cn.litchi.model.entity.Data;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.NodeDataServiceRpc;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/nodeData")
public class NodeDataController extends BaseController {

	@Autowired
	private NodeDataServiceRpc nodeDataService;

	public List<Date> nodeIdAndDateListToListDate(NodeIdAndDateList nodeIdAndDateList) {
		List<Date> dateList = new ArrayList<Date>();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<String> dateStringList = new ArrayList<String>();
		for (String year : nodeIdAndDateList.getYears()) {
			for (String date : nodeIdAndDateList.getDates()) {
				dateStringList.add(year + "-" + date);
			}

		}
		for (String string : dateStringList) {
			try {
				Date date = dateFormat.parse(string);
				dateList.add(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return dateList;
	}

	/*
	 * 温度
	 */

	@PostMapping(value="/temp/interval")
	public MallResult getIntervalNodeDateTempByNodeIdtest(@RequestBody NodeIdAndDateList nodeIdAndDateList) {
		List<MyNodeData> dataList = new ArrayList<MyNodeData>();
		List<Date> dateList = nodeIdAndDateListToListDate(nodeIdAndDateList);
		Iterator<Date> iterator = dateList.iterator();
		Date beginDate = null;
		Date endDate = null;
		int lineNum = -1;
		while (iterator.hasNext()) {
			lineNum++;
			beginDate = iterator.next();
			System.out.println(beginDate);
			if (iterator.hasNext()) {
				endDate = iterator.next();
				System.out.println(endDate);
			}
			List<Data> list = nodeDataService.selectIntervalDatasByDateAndNodeId(beginDate, endDate,
					nodeIdAndDateList.getNodeId());
			if (list == null || list.isEmpty()) {
				MyNodeData myNodeData = new MyNodeData(null, null, lineNum);
				dataList.add(myNodeData);
				continue;
			}
			for (int index = 0; index < list.size(); index++) {
				Data data = list.get(index);
				MyNodeData myNodeData = new MyNodeData(data.getTime(), data.getTemp(), lineNum);
				dataList.add(myNodeData);
			}
		}
		return MallResult.ok(dataList);
	}

	@GetMapping(value = "/temp/threeday")
	public MallResult getLastThreeDayNodeDataTempByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -3);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getTempDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/temp/aweek")
	public MallResult getLastWeekNodeDataTempByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -7);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getTempDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/temp/amouth")
	public MallResult getLastMouthNodeDataTempByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -30);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getTempDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/temp/all")
	public MallResult getNodeDataTempByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectDatasByNodeId(nodeId);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getTempDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	/*
	 * 湿度
	 */

	@PostMapping(value="/humi/interval")
	public MallResult getIntervalNodeDateHumiByNodeIdtest(@RequestBody NodeIdAndDateList nodeIdAndDateList) {
		List<MyNodeData> dataList = new ArrayList<MyNodeData>();
		List<Date> dateList = nodeIdAndDateListToListDate(nodeIdAndDateList);
		Iterator<Date> iterator = dateList.iterator();
		Date beginDate = null;
		Date endDate = null;
		int lineNum = -1;
		while (iterator.hasNext()) {
			lineNum++;
			beginDate = iterator.next();
			System.out.println(beginDate);
			if (iterator.hasNext()) {
				endDate = iterator.next();
				System.out.println(endDate);
			}
			List<Data> list = nodeDataService.selectIntervalDatasByDateAndNodeId(beginDate, endDate,
					nodeIdAndDateList.getNodeId());
			if (list == null || list.isEmpty()) {
				MyNodeData myNodeData = new MyNodeData(null, null, lineNum);
				dataList.add(myNodeData);
				continue;
			}
			for (int index = 0; index < list.size(); index++) {
				Data data = list.get(index);
				MyNodeData myNodeData = new MyNodeData(data.getTime(), data.getHumi(), lineNum);
				dataList.add(myNodeData);
			}
		}
		return MallResult.ok(dataList);
	}

	@GetMapping(value = "/humi/threeday")
	public MallResult getLastThreeDayNodeDataHumiByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -3);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getHumiDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/humi/aweek")
	public MallResult getLastWeekNodeDataHumiByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -7);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getHumiDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/humi/amouth")
	public MallResult getLastMouthNodeDataHumiByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -30);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getHumiDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/humi/all")
	public MallResult getNodeDataHumiByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectDatasByNodeId(nodeId);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getHumiDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	
	/*
	 * Co2
	 */
	
	@PostMapping(value="/co2/interval")
	public MallResult getIntervalNodeDateCo2ByNodeIdtest(@RequestBody NodeIdAndDateList nodeIdAndDateList) {
		List<MyNodeData> dataList = new ArrayList<MyNodeData>();
		List<Date> dateList = nodeIdAndDateListToListDate(nodeIdAndDateList);
		Iterator<Date> iterator = dateList.iterator();
		Date beginDate = null;
		Date endDate = null;
		int lineNum = -1;
		while (iterator.hasNext()) {
			lineNum++;
			beginDate = iterator.next();
			System.out.println(beginDate);
			if (iterator.hasNext()) {
				endDate = iterator.next();
				System.out.println(endDate);
			}
			List<Data> list = nodeDataService.selectIntervalDatasByDateAndNodeId(beginDate, endDate,
					nodeIdAndDateList.getNodeId());
			if (list == null || list.isEmpty()) {
				MyNodeData myNodeData = new MyNodeData(null, null, lineNum);
				dataList.add(myNodeData);
				continue;
			}
			for (int index = 0; index < list.size(); index++) {
				Data data = list.get(index);
				MyNodeData myNodeData = new MyNodeData(data.getTime(), data.getCo2(), lineNum);
				dataList.add(myNodeData);
			}
		}
		return MallResult.ok(dataList);
	}
	
	@GetMapping(value = "/co2/threeday")
	public MallResult getLastThreeDayNodeDataCo2ByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -3);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getCo2DataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/co2/aweek")
	public MallResult getLastWeekNodeDataCo2ByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -7);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getCo2DataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/co2/amouth")
	public MallResult getLastMouthNodeDataCo2ByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -30);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getCo2DataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/co2/all")
	public MallResult getNodeDataCo2ByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectDatasByNodeId(nodeId);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getCo2DataArrayByResult(dataList);
		return MallResult.ok(datas);
	}
	
	
	/*
	 * 光照强度
	 */
	
	@PostMapping(value="/lx/interval")
	public MallResult getIntervalNodeDateLxByNodeIdtest(@RequestBody NodeIdAndDateList nodeIdAndDateList) {
		List<MyNodeData> dataList = new ArrayList<MyNodeData>();
		List<Date> dateList = nodeIdAndDateListToListDate(nodeIdAndDateList);
		Iterator<Date> iterator = dateList.iterator();
		Date beginDate = null;
		Date endDate = null;
		int lineNum = -1;
		while (iterator.hasNext()) {
			lineNum++;
			beginDate = iterator.next();
			System.out.println(beginDate);
			if (iterator.hasNext()) {
				endDate = iterator.next();
				System.out.println(endDate);
			}
			List<Data> list = nodeDataService.selectIntervalDatasByDateAndNodeId(beginDate, endDate,
					nodeIdAndDateList.getNodeId());
			if (list == null || list.isEmpty()) {
				MyNodeData myNodeData = new MyNodeData(null, null, lineNum);
				dataList.add(myNodeData);
				continue;
			}
			for (int index = 0; index < list.size(); index++) {
				Data data = list.get(index);
				MyNodeData myNodeData = new MyNodeData(data.getTime(), data.getLx(), lineNum);
				dataList.add(myNodeData);
			}
		}
		return MallResult.ok(dataList);
	}
	
	@GetMapping(value = "/lx/threeday")
	public MallResult getLastThreeDayNodeDataLxByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -3);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getLxDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/lx/aweek")
	public MallResult getLastWeekNodeDataLxByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -7);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getLxDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/lx/amouth")
	public MallResult getLastMouthNodeDataLxByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -30);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getLxDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/lx/all")
	public MallResult getNodeDataLxByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectDatasByNodeId(nodeId);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getLxDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}
	
	/*
	 * 水分
	 */
	
	@PostMapping(value="/water/interval")
	public MallResult getIntervalNodeDateWaterByNodeIdtest(@RequestBody NodeIdAndDateList nodeIdAndDateList) {
		List<MyNodeData> dataList = new ArrayList<MyNodeData>();
		List<Date> dateList = nodeIdAndDateListToListDate(nodeIdAndDateList);
		Iterator<Date> iterator = dateList.iterator();
		Date beginDate = null;
		Date endDate = null;
		int lineNum = -1;
		while (iterator.hasNext()) {
			lineNum++;
			beginDate = iterator.next();
			System.out.println(beginDate);
			if (iterator.hasNext()) {
				endDate = iterator.next();
				System.out.println(endDate);
			}
			List<Data> list = nodeDataService.selectIntervalDatasByDateAndNodeId(beginDate, endDate,
					nodeIdAndDateList.getNodeId());
			if (list == null || list.isEmpty()) {
				MyNodeData myNodeData = new MyNodeData(null, null, lineNum);
				dataList.add(myNodeData);
				continue;
			}
			for (int index = 0; index < list.size(); index++) {
				Data data = list.get(index);
				MyNodeData myNodeData = new MyNodeData(data.getTime(), data.getWater(), lineNum);
				dataList.add(myNodeData);
			}
		}
		return MallResult.ok(dataList);
	}
	
	@GetMapping(value = "/water/threeday")
	public MallResult getLastThreeDayNodeDataWaterByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -3);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getWaterDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/water/aweek")
	public MallResult getLastWeekNodeDataWaterByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -7);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getWaterDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/water/amouth")
	public MallResult getLastMouthNodeDataWaterByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectLastestNDayDatasByNodeId(nodeId, -30);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getWaterDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}

	@GetMapping(value = "/water/all")
	public MallResult getNodeDataWaterByNodeId(Long nodeId) {
		List<Data> dataList = nodeDataService.selectDatasByNodeId(nodeId);
		if (dataList == null || dataList.isEmpty()) {
			return MallResult.ok(new String[][]{});
		}
		String[][] datas = getWaterDataArrayByResult(dataList);
		return MallResult.ok(datas);
	}
	
	
	
	private String[][] getTempDataArrayByResult(List<Data> listDatas) {
		int dataSize = listDatas.size();
		String[][] datas = new String[dataSize][2];
		Iterator<Data> iterator = listDatas.iterator();
		int index = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		while (iterator.hasNext()) {
			Data data = (Data) iterator.next();
			datas[index][0] = dateFormat.format(data.getTime());
			datas[index][1] = data.getTemp();
			index++;
		}
		return datas;
	}

	private String[][] getHumiDataArrayByResult(List<Data> listDatas) {
		int dataSize = listDatas.size();
		String[][] datas = new String[dataSize][2];
		Iterator<Data> iterator = listDatas.iterator();
		int index = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		while (iterator.hasNext()) {
			Data data = (Data) iterator.next();
			datas[index][0] = dateFormat.format(data.getTime());
			datas[index][1] = data.getHumi();
			index++;
		}
		return datas;
	}

	private String[][] getCo2DataArrayByResult(List<Data> listDatas) {
		int dataSize = listDatas.size();
		String[][] datas = new String[dataSize][2];
		Iterator<Data> iterator = listDatas.iterator();
		int index = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		while (iterator.hasNext()) {
			Data data = (Data) iterator.next();
			datas[index][0] = dateFormat.format(data.getTime());
			datas[index][1] = data.getCo2();
			index++;
		}
		return datas;
	}

	private String[][] getLxDataArrayByResult(List<Data> listDatas) {
		int dataSize = listDatas.size();
		String[][] datas = new String[dataSize][2];
		Iterator<Data> iterator = listDatas.iterator();
		int index = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		while (iterator.hasNext()) {
			Data data = (Data) iterator.next();
			datas[index][0] = dateFormat.format(data.getTime());
			datas[index][1] = data.getLx();
			index++;
		}
		return datas;
	}
	
	private String[][] getWaterDataArrayByResult(List<Data> listDatas) {
		int dataSize = listDatas.size();
		String[][] datas = new String[dataSize][2];
		Iterator<Data> iterator = listDatas.iterator();
		int index = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		while (iterator.hasNext()) {
			Data data = (Data) iterator.next();
			datas[index][0] = dateFormat.format(data.getTime());
			datas[index][1] = data.getWater();
			index++;
		}
		return datas;
	}
	
}
