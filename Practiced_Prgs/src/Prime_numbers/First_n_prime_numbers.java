package Prime_numbers;

import java.util.Scanner;

public class First_n_prime_numbers {
	
	static Scanner sc=new Scanner(System.in);
	public static boolean is_prime(int n) {
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
	
	public static int[] Create_Array()
	{
		System.out.println("Enter the array size :");
		 int size = sc.nextInt();
		 int a[]=new int[size];
		 return a;
	}

	public static void main(String[] args) {
		int p[]=First_n_prime_numbers.Create_Array();
		for(int i=0,j=2;i<p.length;j++)
		{
			if(is_prime(j))
			{
				p[i++]=j;
			}
		}
		
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] +",");
		}


	}

}
