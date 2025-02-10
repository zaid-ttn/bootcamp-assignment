class MyClass{
	private MyClass(){}

	public void printer(){
		System.out.println("Printer Method");
	}

	public static MyClass getInstance(){
		MyClass m1=new MyClass();
		return m1;
	}
}
public class FactoryCreation{
	public static void main(String[]args){
		MyClass m=MyClass.getInstance(); //we can use interface MyClass instead of class
		m.printer();
	}
}
