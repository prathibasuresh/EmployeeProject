	package Number_Theory;

public class Happy_num {

	public static void main(String[] args) {
		int num=2487;
		while(num>9)
		{
			int res=0;
			while(num>0)
			{
				int d=num%10;
				res=res+(d*d);
				num=num/10;
			}
			num=res;
		}
		if(num==1 || num==7)
		{
			System.out.println("The given number is Happy number");
		}
		else
		{
			System.out.println("The given number is not Happy number");
		}
				


	}

}
