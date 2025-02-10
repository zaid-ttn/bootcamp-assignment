class Logger{
	private static Logger instance;
	private Logger(){}
	public static Logger getInstance(){
		if(instance==null){
			instance=new Logger();
		}
		return instance;
	}

	public void logged(String m){
		System.out.println(m);
	}

}
public class DesignSingleton{
	public static void main(String[]args){
		Logger l1=Logger.getInstance();
		l1.logged("Log In");

		Logger l2=Logger.getInstance();
		l2.logged("logged In");


		if(l1==l2){
			System.out.println("Successfully Logged in user");
		}
	}
}
