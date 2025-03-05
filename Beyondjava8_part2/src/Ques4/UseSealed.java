package Ques4;
sealed class A permits B,C{
        void display(){
        System.out.println("From A");
    }

}
non-sealed class B extends A{
    @Override
    void display() {
        System.out.println("Display Form B");
    }
}
non-sealed class C extends A {
    //@Override
    void display() {
        System.out.println("From C");
    }
}

public class UseSealed {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
    }
}
