package com.spring.practise.demo_spring.component;
import com.spring.practise.demo_spring.scope.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {
    @Autowired
    ComponentJdbc componentJdbc;

    public ComponentJdbc getJdbcConnection() {
        return componentJdbc;
    }
    public void setJdbcConnection(ComponentJdbc componentJdbc) {

        this.componentJdbc=componentJdbc;
    }

}
