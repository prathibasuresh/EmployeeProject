package String_prgms;

import java.util.Scanner;

public class Reverse_String_with_Same_Position1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String[] words= sc.nextLine().split("\\s");
		String rev_str="";
		for(String w:words)
		{
			StringBuffer sb=new StringBuffer(w);
			rev_str+=sb.reverse().toString()+" ";
		}
		System.out.println("The reversed String is :"+rev_str);

	}

}
