package com.gtr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(basePackages= {"com.gtr.Mapper"})
public class GtrnetApplication {
	public static void main(String[] args) {
		SpringApplication.run(GtrnetApplication.class, args);
		System.out.println("start");
	}
}
