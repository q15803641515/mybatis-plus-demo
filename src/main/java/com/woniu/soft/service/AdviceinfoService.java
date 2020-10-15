package com.woniu.soft.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.woniu.soft.entity.Adviceinfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
public interface AdviceinfoService extends IService<Adviceinfo> {
	List<Adviceinfo> selectAdviceinfosByMid(Integer mid)throws Exception;
	void removeByMid(Integer mid)throws Exception;
}
