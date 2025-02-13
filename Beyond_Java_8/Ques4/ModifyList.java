package Ques4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyList {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(34);
        ls.add(4);
        ls.add(3);
        ls.add(45);
        List<Integer>unmodifyList=ls.stream().collect(Collectors.toUnmodifiableList());
//        unmodifyList.add(112);
        unmodifyList.forEach(System.out::println);
    }
}
