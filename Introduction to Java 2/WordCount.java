import java.util.*;
import java.io.*;
public class WordCount{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter File to be Read");
		String name=sc.nextLine().trim();

		System.out.println("Enter word to count occurence");
		String wordFind=sc.nextLine().trim();

		int count=0;

//		File f=new File(u+s+name);

		try{
			FileReader fr=new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
            		String line;

			while((line=br.readLine())!=null){
				String[] lineArr=line.split("\\W+");
				for(String word:lineArr){
					if(word.equals(wordFind)){
						count++;
					}
				}
			}
			System.out.println("Word Appears = "+count+"times");
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
