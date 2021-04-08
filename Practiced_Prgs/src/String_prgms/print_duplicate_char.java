package String_prgms;

import java.util.Scanner;

public class print_duplicate_char {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		char a[] =s.nextLine().toCharArray();
		int count;
		System.out.println("The repeated characters are :");
		for (int i = 0; i < a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j] && a[i]!=' ')
				{
					count++;
					a[j]='*';
				}
			}
			if(count>1 && a[i]!='*')
			{
				System.out.println(count +" times " +a[i] +" repeated");
			}
			
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}

	}

}
