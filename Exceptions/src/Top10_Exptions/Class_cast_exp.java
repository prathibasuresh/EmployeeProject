package Top10_Exptions;

public class Class_cast_exp {

	public static void main(String[] args) {
		String s=new String("prathi");
		Object o=(Object)s;
		System.out.println(o);
		
		Object o1=new Object();
		try
		{
		String s1=(String)o1; //CCE
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Object o2=new String("suresh");
		String s2=(String)o2;
		System.out.println(o2);// object type suresh
		System.out.println(s2);//String type suresh
		


	}

}
