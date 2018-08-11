package com.dataService.dataService;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dataService.dataService.mapper")
public class DataServiceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DataServiceApplication.class, args);
        System.out.println( "Hello dataService!" );
    }
}
