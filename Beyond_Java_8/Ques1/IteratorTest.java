package Ques1;

import java.util.stream.Stream;

public class IteratorTest {
    public static void main(String[] args) {
        Stream<Integer>stream=Stream.iterate(1000,n->n+5000).limit(7);
        stream.forEach(System.out::println);
    }
}
