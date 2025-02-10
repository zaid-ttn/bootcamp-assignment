import java.util.Scanner;

public class UserInput{
	public static void main(String[] agrs){
		Scanner sc=new Scanner(System.in);
		String[]arr=new String[100];
		int count=0,i=0;
		System.out.println("ENter Text");

		while(true){
			String word=sc.nextLine();
			if(word.equals("XDONE")){
				break;
			}
		arr[count]=word;
		count++;
		}

		System.out.println("Befor XDONE command");
		while(i<=count){
			System.out.println(arr[i]);
			i++;
		}
	}
}
