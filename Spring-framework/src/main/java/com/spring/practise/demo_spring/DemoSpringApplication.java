package com.spring.practise.demo_spring;

import com.spring.practise.demo_spring.basicexample.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(DemoSpringApplication.class, args);
		BinarySearch bs=ac.getBean(BinarySearch.class);
		System.out.println(bs);
		int result= bs.binarySearch(2,3);
		System.out.println(result);
	}

}
