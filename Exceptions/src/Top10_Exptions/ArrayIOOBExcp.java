package Top10_Exptions;

public class ArrayIOOBExcp {

	public static void main(String[] args) {
		int[] a=new int[10];
		System.out.println(a[0]);
		System.out.println(a[9]);
		try
		{
		System.out.println(a[100]); //Responsible for exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
