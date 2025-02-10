interface ForReference{
    int referenceFor(int a,int b);
}
class Operations{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}

public class MethodExample {
    public static void main(String[] args) {
        ForReference multi=Operations::multiply;
        System.out.println("Multiplication = "+multi.referenceFor(4,2));

        Operations op=new Operations();

        ForReference addi=op::add;
        System.out.println("For addition ="+ addi.referenceFor(4,2));

        ForReference subi=op::sub;
        System.out.println("For Subtraction = "+subi.referenceFor(4,2));
    }
}
