package Excep1_pkg_durga;

public class Nested_try_catch {

	public static void main(String[] args) {
		int i=(Integer) null;
		try
		{
			
			System.out.println("out try");
			System.out.println(i);
			try
			{
				System.out.println("in try");
				System.out.println(10/0);
			}
			catch (ArithmeticException e) {
				System.out.println("in catch");
			}
		}
		catch (Exception e) {
			System.out.println("out catch");
		}
		finally {
			System.out.println("finally");
		}

	}

}
