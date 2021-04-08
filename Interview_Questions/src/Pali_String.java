

public class Pali_String {

	public static void main(String[] args) {
		String str="Rar";
		String rev_str="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev_str+=str.charAt(i);
		}
		//System.out.println(rev_str);
		
		if(rev_str.equalsIgnoreCase(str))
		{
			System.out.println("String is a palindrome");
		}
		else
			System.out.println("String is not a palindrome");

	}

}
