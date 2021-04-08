package Number_Theory;

public class Rev_Num {

	public static void main(String[] args) {
		int num=3201;
		int temp=num;
		int rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);

	}

}
