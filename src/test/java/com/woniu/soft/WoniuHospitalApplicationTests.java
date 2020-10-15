package com.woniu.soft;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniu.soft.entity.Adviceinfo;
import com.woniu.soft.service.AdviceinfoService;

@SpringBootTest(classes = WoniuHospitalApplication.class)
class WoniuHospitalApplicationTests {
	
	@Resource
	private AdviceinfoService aiService;
	
	
	@Test
	void contextLoads() {
		Page<Adviceinfo> page = new Page<Adviceinfo>(1,1);
		aiService.page(page);
		System.out.println("????"+page.toString());
	}

}
