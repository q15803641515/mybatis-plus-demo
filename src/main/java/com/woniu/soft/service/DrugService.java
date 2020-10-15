package com.woniu.soft.service;

import com.woniu.soft.entity.Drug;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public interface DrugService extends IService<Drug> {
	void updateDrugUp(Integer drugId,Integer number)throws Exception;
	void updateDrugDown(Integer drugId,Integer number)throws Exception;
}
