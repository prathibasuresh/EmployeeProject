package Top10_Exptions;

public class Illegal_arg_Exp {

	public static void main(String[] args)
	{
		 Thread t=new Thread();
		 t.setPriority(10);
		 t.setPriority(100);//" java.lang.IllegalArgumentException by (Illegal_arg_Exp.java:9)
	}

}
