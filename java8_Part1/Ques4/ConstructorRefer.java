interface A {
    B display();
}

class B {
    B() {
        System.out.println("B Constructor");
    }
}

public class ConstructorRefer {
    public static void main(String[] args) {
        A a = B::new;
        B obj = a.display();
    }
}
