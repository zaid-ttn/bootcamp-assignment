package Ques6;

import java.util.*;

public class UseSequenced {
    public static void main(String[] args) {
        List<Integer>ls= new ArrayList<>();
        ls.add(12);
        ls.add(13);
        ls.addFirst(11);
        ls.addLast(4);
        System.out.println(ls);
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);
        System.out.println("Get First- "+ls.getFirst());
        System.out.println("Get Last - "+ls.getLast());
        System.out.println("Perform Reverse- "+ls.reversed());

        //for Set
        //cannot perform on hashset
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(12);
        set.add(13);
        set.addFirst(11);
        set.addLast(4);
        System.out.println(ls);
        set.removeFirst();
        set.removeLast();
        System.out.println(ls);
        System.out.println("Get First- "+set.getFirst());
        System.out.println("Get Last - "+set.getLast());
        System.out.println("Perform Reverse- "+set.reversed());


    }
}
