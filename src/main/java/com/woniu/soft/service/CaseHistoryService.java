package com.woniu.soft.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.CaseHistory;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qinmian
 * @since 2020-10-13
 */
public interface CaseHistoryService extends IService<CaseHistory> {
	List<CaseHistory> selectCaseHistory(Integer uid)throws Exception;
}
