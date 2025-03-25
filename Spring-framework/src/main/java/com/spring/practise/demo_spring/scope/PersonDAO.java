package com.spring.practise.demo_spring.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {
    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
    public void setJdbcConnection(JdbcConnection jdbcConnection) {

        this.jdbcConnection = jdbcConnection;
    }
    @PostConstruct
    public void firstToLoad(){
        System.out.println("From POst contructor");
    }
    @PreDestroy
    public void doDestroy(){
        System.out.println("From pre destroy");
    }


}
