public class HandlingBlocks{
	public static void main(String[]args){
		try{
			Class.forName("Blocks"); //consider Blocks as a class
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
