package com.spring.practise.demo_spring.basicexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class UseQuick  implements SortMethod{
    public int sort(int x,int y){
        System.out.println("From quick ");
        return 1;
    }

}

