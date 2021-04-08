
public final class Final_method_overloading {
	
	 public static int add(int i)
	{
		return i;
	}
	
	public static int add(int i, int j)
	{
		int c=i+j;
		return c;
				
	}
	public static void main(String[] args) {
		System.out.println(add(10));
		System.out.println(add(20, 30));
	}

}
