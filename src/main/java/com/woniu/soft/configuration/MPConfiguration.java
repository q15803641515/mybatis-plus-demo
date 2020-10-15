package com.woniu.soft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;

@Configuration
public class MPConfiguration {  
	    @Bean
	    public MybatisPlusInterceptor mybatisPlusInterceptor() {
	        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
	        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
	        return interceptor;
	    }
}