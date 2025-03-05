package Ques7;

import java.util.LinkedHashMap;

public class SequenceMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        map.putFirst(26,"Z");
        map.putLast(25,"Y");
        System.out.println(map.reversed());
    }
}
