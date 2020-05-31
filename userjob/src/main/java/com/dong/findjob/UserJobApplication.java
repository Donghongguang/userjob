package com.dong.findjob;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dong.findjob.mapper")
@SpringBootApplication
public class UserJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserJobApplication.class, args);
	}

}
