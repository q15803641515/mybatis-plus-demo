package com.woniu.soft.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.MedAdvice;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public interface MedAdviceService extends IService<MedAdvice> {
	
	Page selectByWidLimit(Integer wid,Integer pageIndex,Integer pageNum) throws Exception;
	
	List<MedAdvice> selectListByStatus(Integer status) throws Exception;
	
	
}
