package Ques5;
sealed class A permits B,D,C {
    void display(){
        System.out.println("From A");
    }

}
non-sealed class B extends A {
    @Override
    void display() {
        System.out.println("Display Form B");
    }
}
non-sealed class C extends A {
    @Override
    void display() {
        System.out.println("From C");
    }
}
non-sealed class D extends A{
    @Override
    void display() {
        System.out.println("From D");
    }
}
class E extends D{
    @Override
    void display() {
        System.out.println("From E");
    }
}
public class VariousSealed {
    public static void main(String[] args) {
//        E obj=new E();
//        obj.display();
        A obj=new A();
        obj.display();
    }
}
