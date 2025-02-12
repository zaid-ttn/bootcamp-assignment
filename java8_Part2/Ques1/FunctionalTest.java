package javafeatures;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalTest {
    public static void main(String[] args) {
        //consumer
        Consumer<Integer>consumer=(val)-> {
            if(val==2){
                System.out.println("Value is 2");
            }
        };
        consumer.accept(2);
        //supplier
        Supplier<String>supplier=()-> "Return from supplier";
        System.out.println(supplier.get());


        //function

        Function<String,String> function=(val)->{
            String s="Return from function";
            return s;
        };
        String str=function.apply("Where return");
        System.out.println(str);

        // predicate

        Predicate<Integer>predicate=(val)->{
            if(val==10){
                return true;
            }
            else{
                return false;
            }
        };

        System.out.println(predicate.test(10));

    }
}
