package com.woniu.soft.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Generator {
	public static void main(String[] args) {
		//1. 全局配置
	    String projectPath = System.getProperty("user.dir");
	    GlobalConfig config = new GlobalConfig();
	    config.setAuthor("qinmian") //作者
	        .setOutputDir(projectPath+"\\src\\main\\java")  //生成路径
	        .setFileOverride(true)//是否文件覆盖，如果多次
	        .setIdType(IdType.AUTO) //主键策略
	        .setServiceName("%sService") //设置生成的service接口名首字母不用I开头
	        .setBaseResultMap(true)//映射文件中生成默认的baseMap
	        .setBaseColumnList(true);//映射文件中生成默认的基础列名sql
	     //2. 数据源配置
	    DataSourceConfig dsConfig = new DataSourceConfig();
	    dsConfig.setDbType(DbType.MYSQL)
	        .setUrl("jdbc:mysql://localhost:3306/db_hospital")
	        .setDriverName("com.mysql.jdbc.Driver")
	        .setUsername("root")
	        .setPassword("123456");
	    //3.策略配置
	    StrategyConfig stConfig = new StrategyConfig();
	    stConfig.setCapitalMode(true) // 全局大写命名
	        .setNaming(NamingStrategy.underline_to_camel) //下划线转驼峰
	        .setInclude("drug_history");//生成的表,参数为数组
	    	
	    //4.包名策略
	    PackageConfig pkConfig = new PackageConfig();
	    pkConfig.setParent("com.woniu.soft")//父包名
	        .setController("controller")
	        .setEntity("entity")
	        .setService("service")
	        .setMapper("mapper")
	        .setXml("mapper");
	    //5.整合配置
	   AutoGenerator ag = new AutoGenerator().setGlobalConfig(config)
	        .setDataSource(dsConfig)
	        .setStrategy(stConfig)
	        .setPackageInfo(pkConfig);
	        ag.execute();
	}
	
}
