import java.util.Scanner;

public class Method_Chainig1 {
	
	public static int add(int i, int j)
	{
		System.out.println(divide(25,5));
		int c=i+j;
		return c;
	}
	public static float divide(float i, int j)
	{
		 float c = i+j;
		 return c;
	}

	public static boolean is_prime(int n)
	{
		System.out.println(add(10,20));
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
			flag=false;
			break;
		}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		System.out.println(is_prime(3));


		
		

	}

}
