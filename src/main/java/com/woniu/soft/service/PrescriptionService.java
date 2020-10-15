package com.woniu.soft.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.Prescription;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public interface PrescriptionService extends IService<Prescription> {
	
	Prescription selectByMid(Integer mid)throws Exception;
	
	Prescription selectByMidStatus(Integer mid,Integer status)throws Exception;
	
	void removeByAdId(Integer adId)throws Exception;
	
	void updateStatusEq1(Prescription prescription)throws Exception;
	
}
