	import java.util.Scanner;

public class SumArray{

		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			SumArray sa=new SumArray();
			System.out.println("Enter Number of columns");
			int c=sc.nextInt();

			System.out.println("Enter number of rows");
			int r=sc.nextInt();

			int arr[][]=new int[r][c];
			System.out.println("Enter elements of Array");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					arr[i][j]=sc.nextInt();
				}
			}

			sa.getSumRows(arr,r,c);
			sa.getSumColumns(arr,r,c);
		}


		public void getSumRows(int arr[][],int r,int c){
			for(int i=0;i<r;i++){
			int rowSum=0;
				for(int j=0;j<c;j++){
					rowSum+=arr[i][j];
				}
			System.out.println("Row sum = "+ rowSum);
			}
		}
		public void getSumColumns(int arr[][],int r,int c){
                        for(int i=0;i<c;i++){
			int columnSum=0;
                                for(int j=0;j<r;j++){
                                        columnSum+=arr[j][i];
                                }
			System.out.println("Column sum = "+ columnSum);

                        }

                }
}
