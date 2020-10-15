package com.woniu.soft.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.ReturnApplication;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qinmian
 * @since 2020-10-14
 */
public interface ReturnApplicationService extends IService<ReturnApplication> {
	List<ReturnApplication> selectListByStatusEq3()throws Exception;
	
	void updateStatusEq4(Integer id)throws Exception;
	
}
