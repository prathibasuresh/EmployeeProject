package String_prgms;

import java.util.Scanner;

public class Reverse_String_with_Same_Position {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in); 
		System.out.println("Enter the String");
		String[] words = s1.nextLine().split(" ");
		String rev_str="";
		System.out.println(words.length);
		
//	for (int i = 0; i < words.length; i++) {
//		System.out.println(words[i]);
//	}
		for(String w:words)
		{
			String rev_word="";
//			System.out.println(w);
//			System.out.println(w.length());
			for(int i=w.length()-1;i>=0;i--)
			{
				rev_word+=w.charAt(i);
			}
			rev_str+=rev_word+" ";

		}
		System.out.println("The reversed string in the same place is :"+rev_str);
	}

}
