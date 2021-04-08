                                                                                                                                                                                                                                                                                           
public class Method_Chaining {
	
	public static void  m1()
	{
		m2();
		System.out.println("from m1");
	}
	public static void  m2()
	{
		m3();
		System.out.println("from m2");
	}
	
	public static void  m3()
	{
		System.out.println("from m3");
	}

	public static void main(String[] args) {
		
		m1();
	}

}

