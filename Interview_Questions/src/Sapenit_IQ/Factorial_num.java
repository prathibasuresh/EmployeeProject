package Sapenit_IQ;

public class Factorial_num {
	public static long Fact(int n)
	{
		if(n==1) return 1;
		return n* Fact(n-1);
	}

	public static void main(String[] args) {
		System.out.println(Fact(5));
		

	}

}
