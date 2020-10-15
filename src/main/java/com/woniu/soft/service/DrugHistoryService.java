package com.woniu.soft.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.DrugHistory;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qinmian
 * @since 2020-10-14
 */
public interface DrugHistoryService extends IService<DrugHistory> {
	void saveDrugReturn(Integer drugId,Integer number,Integer uid)throws Exception;
	void saveDrugDeliver(Integer drugId,Integer number,Integer uid)throws Exception;
	void saveDrugPutIn(Integer drugId,Integer number,Integer uid)throws Exception;
}
