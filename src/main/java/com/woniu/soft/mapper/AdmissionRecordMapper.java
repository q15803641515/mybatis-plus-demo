package com.woniu.soft.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.woniu.soft.entity.AdmissionRecord;
import com.woniu.soft.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qinmian
 * @since 2020-10-13
 */
public interface AdmissionRecordMapper extends BaseMapper<AdmissionRecord> {
	User findUser() throws Exception;
}
