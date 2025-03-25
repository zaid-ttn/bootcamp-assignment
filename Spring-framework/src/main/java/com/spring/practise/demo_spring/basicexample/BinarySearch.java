package com.spring.practise.demo_spring.basicexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

//    @Autowired
//    private SortMethod bubbleSort;  Autowiring by name

//    @Autowired
//    @Qualifier("bubble") //for this we have to specify where we are autowiring
//@Qualifier("useBubble") //this will automatically identify object of UseBubble bean as you can name convention


    private SortMethod sortMethod;
    @Autowired
    BinarySearch(@Qualifier("bubble") SortMethod sortMethod){
        this.sortMethod=sortMethod;
    }
   public int binarySearch(int x,int y) {
        int r = sortMethod.sort(x, y);
        return r;
    }
}
