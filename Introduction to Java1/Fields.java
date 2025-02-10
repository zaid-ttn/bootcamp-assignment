public class Fields{

	static{
		System.out.println("Firstname is Zaid");
	}
	static int age=22;

	public static void lastName(){
		System.out.println("Lastname is Khan");
	}
	public static void main(String[]args){
		Fields.lastName();
		int age=Fields.age;
		System.out.println("Age is "+age);
	}
}
