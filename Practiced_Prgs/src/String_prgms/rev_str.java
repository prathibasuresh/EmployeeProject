package String_prgms;

import java.util.Scanner;

public class rev_str {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String rev_str="";
		String str = sc.next();
		
		//Using charAt() method
		for (int i=str.length()-1;i>=0;i--) {
			
			rev_str+=str.charAt(i);
		}
		System.out.println("The rversed string is :"+rev_str);
		
		
		/*//Using Character Array
		  char a[]=str.toCharArray();
		  for (int i = a.length-1; i >=0; i--) {
			
			  rev_str+=a[i];
		}
		  System.out.println("The rversed string is :"+rev_str);
		  */
//		StringBuffer sb=new StringBuffer(str);
//		System.out.println("The Reversed string :" +sb.reverse().toString());
		
		StringBuilder sbd=new StringBuilder(str);
		System.out.println(sbd.reverse().toString());
	}

}
