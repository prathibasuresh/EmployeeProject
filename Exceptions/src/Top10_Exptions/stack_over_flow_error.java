package Top10_Exptions;

public class stack_over_flow_error {
	public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		m1();
	}

}
