import java.util.Scanner;

public class CalculatorMenu{

		public static void AreaOfCircle(int r){
			double result=(3.14*r*r);
			System.out.println("Area Of Circle is "+result);
		}
		public static void CircumOfCircle(int r){
			System.out.println("Circumference of circle "+(2*3.14*r));
		}


		public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int option=0;
		int r=0;
		while(true){
			System.out.println("*******Menu*******");
			System.out.println("1-Calculate Area Of Circle");
			System.out.println("2-Calculate Circumference of circle");
			System.out.println("3-Exit");
			option=sc.nextInt();

			switch(option){
				case 1:
					System.out.println("Enter Radius");
					r=sc.nextInt();
					CalculatorMenu.AreaOfCircle(r);
					break;
				case 2:
					System.out.println("Enter Radius");
                        		r=sc.nextInt();
                        		CalculatorMenu.CircumOfCircle(r);
                        		break;
				case 3:
					System.exit(0);
				default:
					System.out.println("invalid Option");
			}
		}

	}
}
