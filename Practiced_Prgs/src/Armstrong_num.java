
public class Armstrong_num {
	
	public static int count(int num)
	{
		int i;
		for(i=0;num>0;i++)
		{
			num/=10;
		}
		return i;
	}
	
	public static int pow(int x,int n)
	{
		int pow=1;
		for (int i = 0; i < n; i++) {
			pow=pow*x;
		}
		return pow;
	}

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int n= Armstrong_num.count(num)	;
		System.out.println(n);
		while(temp>0)
		{
			int d=temp%10;
			sum=sum+pow(d,n);
			temp/=10;
		}
		if(num==sum)
		{
			System.out.println("Given number is an armstrong number");
		}
		else
		{
			System.out.println("Given number is not an armstrong number");
		}

	}

}
