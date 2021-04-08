package Number_Theory;

public class Strong_num {

	public static int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		int num=123;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int d=temp%10;
			sum+=fact(d);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("Given number is strong number");
		}
		else
		{
			System.out.println("Given number is not a strong number");
		}
	}

}
