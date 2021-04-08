package Top10_Exptions;

public class Exp_In_initializer_Error {
	
	//static int x=10/0; //(Exp_In_initializer_Error.java:5)

	static{
		String s=null;
		System.out.println(s.length());//(Exp_In_initializer_Error.java:9)
		

	}

	public static void main(String[] args) {
	
	}

}
