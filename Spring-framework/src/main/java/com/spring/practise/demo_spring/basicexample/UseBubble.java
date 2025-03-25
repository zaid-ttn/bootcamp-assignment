package com.spring.practise.demo_spring.basicexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble") //put in constructor about qualifier
public class UseBubble implements SortMethod{
    public int sort(int x,int y){
        System.out.println("From Bubble");
        return 2;
    }
}
