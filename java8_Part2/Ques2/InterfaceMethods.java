package interfacemethods;
interface MyInterface{
    default int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }

}
class MyClass implements MyInterface{
    void display(){
        System.out.println("From Interface");
    }
}
public class InterfaceMethods {
    public static void main(String[] args) {
        MyInterface mi=new MyClass();
        //default method
        System.out.println(mi.add(3,4));
        //static
        int x=MyInterface.sub(10,4);
        System.out.println(x);


    }
}
