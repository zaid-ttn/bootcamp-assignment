interface A {
    default void display(){
        System.out.println("interface A");
    }
}
interface B extends A{
    default void display(){
        System.out.println("interface B");
    }
}
interface C extends A{
    default void display(){
        System.out.println("Interface C");
    }
}

public class MultipleInheri implements B,C{
    public void display(){
        System.out.println("By Overridden ");
    }

    public static void main(String[] args) {
        MultipleInheri mi=new MultipleInheri();
        mi.display();
    }
}

