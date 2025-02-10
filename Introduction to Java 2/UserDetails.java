import java.util.*;
import java.io.*;
class User{
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;

	User(String firstName,String lastName,int age,String phoneNumber){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.phoneNumber=phoneNumber;
	}

	public String moveDetails(){
		return firstName + "," + lastName + "," + age + "," + phoneNumber + "\n";
	}
}

public class UserDetails{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String toContinue="continue";
	//	File f=new File("/home/moh/Assignment/Details.txt");
		try{
			while(!toContinue.equals("quit")){
				System.out.println("Enter firstName");
				String fname=sc.nextLine().trim();

				System.out.println("Enter lastName");
                        	String lname=sc.nextLine().trim();

				System.out.println("Enter Age");
                        	int age=sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Phone Number");
                        	String pNumber=sc.nextLine().trim();

				User user=new User(fname,lname,age,pNumber);

				FileWriter fw=new FileWriter("Details.txt",true);
				fw.write(user.moveDetails());
				fw.flush();
				//sc.nextLine();

				System.out.println("Data Moved");
				System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
				toContinue=sc.nextLine().trim();

			}
		}catch (IOException e) {
            		e.printStackTrace();
		}



	}
}

