package com.woniu.soft.service.impl;

import com.woniu.soft.entity.Drug;
import com.woniu.soft.mapper.DrugMapper;
import com.woniu.soft.service.DrugService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liming
 * @since 2020-10-12
 */
@Service
public class DrugServiceImpl extends ServiceImpl<DrugMapper, Drug> implements DrugService {


	@Override
	public void updateDrugDown(Integer drugId, Integer number) throws Exception {
		Drug drug = this.getById(drugId);
		drug.setNumber(drug.getNumber()-number);
		boolean update = this.updateById(drug);
		
	}


	@Override
	public void updateDrugUp(Integer drugId, Integer number) throws Exception {
		Drug drug = this.getById(drugId);
		drug.setNumber(drug.getNumber()+number);
		this.updateById(drug);
		
	}

	
}
