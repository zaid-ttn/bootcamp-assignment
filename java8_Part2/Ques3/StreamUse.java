import java.util.Arrays;
import java.util.List;

public class StreamUse {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(2,4,6,6,8);
        int result=ls.stream().filter((val)->val>5).mapToInt(val->val).sum();
        System.out.println(result);
    }
}
