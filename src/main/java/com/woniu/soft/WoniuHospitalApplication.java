package com.woniu.soft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.woniu.soft.mapper")
@ImportResource("classpath:transaction.xml")
public class WoniuHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoniuHospitalApplication.class, args);
	}

}
