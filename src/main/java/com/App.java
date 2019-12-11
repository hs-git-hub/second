package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.annotations.Mapping;


@SpringBootApplication
@MapperScan("com.repository")
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		
	}
}
