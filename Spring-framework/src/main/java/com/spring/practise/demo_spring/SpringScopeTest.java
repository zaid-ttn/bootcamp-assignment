package com.spring.practise.demo_spring;

import com.spring.practise.demo_spring.scope.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringScopeTest {

   // public static Logger logger= LoggerFactory.getLogger(SpringScopeTest.class);
    public static void main(String[] args) {
        System.out.println("From main");
        ApplicationContext applicationContext = SpringApplication.run(SpringScopeTest.class);
        PersonDAO dao = applicationContext.getBean(PersonDAO.class);

        PersonDAO dao2 = applicationContext.getBean(PersonDAO.class);
        System.out.println(dao);
        System.out.println(dao2);
        System.out.println(dao.getJdbcConnection());
        System.out.println(dao2.getJdbcConnection());

    }

}
