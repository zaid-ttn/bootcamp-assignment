package Ques3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class UseOf {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer>set=Set.of(2,3,4,5,6);
        Map<Integer,String>map=Map.of(1,"car",2,"bike",89,"Auto");
        list.forEach(System.out::println);
        set.forEach(System.out::println);
        map.forEach((i, s) -> System.out.println(i+" value is="+s));//it it BiFunction
    }
}
