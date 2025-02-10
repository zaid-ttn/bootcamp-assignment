class CreateExcep extends Exception{
	public CreateExcep(String m){
		super(m);
	}
}
public class CustomExcep{
	public static void main(String[]args){
		try{
			throw new CreateExcep("Custom Exception");
		}catch(CreateExcep e){
			System.out.println(e.getMessage());
	}	}
}
