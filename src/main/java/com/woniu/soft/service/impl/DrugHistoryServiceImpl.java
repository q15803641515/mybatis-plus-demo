package com.woniu.soft.service.impl;

import com.woniu.soft.entity.DrugHistory;
import com.woniu.soft.mapper.DrugHistoryMapper;
import com.woniu.soft.service.DrugHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qinmian
 * @since 2020-10-14
 */
@Service
public class DrugHistoryServiceImpl extends ServiceImpl<DrugHistoryMapper, DrugHistory> implements DrugHistoryService {

	@Override
	public void saveDrugReturn(Integer drugId, Integer number,Integer uid) throws Exception {
		DrugHistory drugHistory = new DrugHistory();
		drugHistory.setDrugId(drugId);
		drugHistory.setNumber(number);
		drugHistory.setuId(uid);
		drugHistory.setStatus(2);
		this.save(drugHistory);
	}

	@Override
	public void saveDrugDeliver(Integer drugId, Integer number, Integer uid) throws Exception {
		DrugHistory drugHistory = new DrugHistory();
		drugHistory.setDrugId(drugId);
		drugHistory.setNumber(number);
		drugHistory.setuId(uid);
		drugHistory.setStatus(1);
		this.save(drugHistory);
	}

	@Override
	public void saveDrugPutIn(Integer drugId, Integer number, Integer uid) throws Exception {
		DrugHistory drugHistory = new DrugHistory();
		drugHistory.setDrugId(drugId);
		drugHistory.setNumber(number);
		drugHistory.setuId(uid);
		drugHistory.setStatus(0);
		this.save(drugHistory);
	}
}
