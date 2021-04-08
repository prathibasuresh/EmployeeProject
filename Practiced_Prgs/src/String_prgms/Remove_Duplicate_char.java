package String_prgms;

import java.util.Scanner;

public class Remove_Duplicate_char {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Strig");
		char a[]=s.nextLine().toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			boolean repeated=false;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					repeated=true;
					break;
				}
				  
			}
			if(!repeated)
			{
				System.out.print(a[i]);
			}
			
		}
				


	}

}
