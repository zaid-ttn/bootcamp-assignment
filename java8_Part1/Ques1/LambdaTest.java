import java.util.Scanner;

interface Larger{
    boolean greaterNumber(int a,int b);
}
interface IncrementValue{
    int valueIncreased(int a);
}
interface ConcatenateWords{
    String wordsConcatenate(String a,String b);
}
interface ToCapital{
    String toCapital(String s);
}


public class LambdaTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	System.out.println("Part 1");
        Larger lg=(a,b)->{
            if(a>b){
                System.out.println("Greater is A = "+a);
                return true;
            }else{
                System.out.println("Greater is B = "+b);
                return false;
            }
        };
        lg.greaterNumber(4,5);

        // part2
	System.out.println("Part 2");
        IncrementValue iv=(a)-> a+1;
        System.out.println("Enter Value to Increase");
        int x=sc.nextInt();
	sc.nextLine();
        System.out.println("Aferr Increasing the value = " +iv.valueIncreased(x));

        //part 3

	System.out.println("Part 3");
        ConcatenateWords cw=(a,b)->a+b;
        System.out.println("Enter Firstword");
        String a=sc.nextLine();
        System.out.println("Enter Second word");
        String b=sc.nextLine();
        System.out.println("After Concatenate ="+cw.wordsConcatenate(a,b));

        //part 4

	System.out.println("Part 3");
        ToCapital tc=(s)->s.toUpperCase();
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("To uppercase ->"+tc.toCapital(input));



    }
}
