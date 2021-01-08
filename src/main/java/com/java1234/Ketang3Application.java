package com.java1234;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.java1234.mapper")
public class Ketang3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ketang3Application.class, args);
	}

}
