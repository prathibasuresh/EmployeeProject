package Top10_Exptions;

public class Number_format_exp {

	public static void main(String[] args) {
		int i=Integer.parseInt("10");
		System.out.println(i);
		
		int j=Integer.parseInt("ten");
		System.out.println(j); // java.lang.NumberFormatException at Top10_Exptions.Number_format_exp.main(Number_format_exp.java:9)


	}

}
