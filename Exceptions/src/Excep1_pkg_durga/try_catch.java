package Excep1_pkg_durga;

public class try_catch {

	public static void main(String[] args) {
		//System.out.println("Statement-1");
		try {
		System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
//			System.out.println(e );
//			System.out.println(e.toString());
			System.out.println(e.getMessage());     /// by zero
			System.out.println(e.getClass());		//class java.lang.ArithmeticException
			//System.out.println(10/2);
		}
		//System.out.println("statement-2");

	}

}
