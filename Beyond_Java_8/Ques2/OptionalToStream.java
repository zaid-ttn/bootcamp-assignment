package Ques2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalToStream {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(3,4,5,6,71,2,3);
        Optional<Integer>opt=ls.stream().filter(i->i%3==0).findFirst();
        Stream<Integer>stream=opt.stream();
        stream.forEach(System.out::println);

    }
}
