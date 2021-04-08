
public class unique_element_in_an_array {

	public static int[] Array_unique_elment(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			boolean isUnique=false;
			for (int j = 0; j < i; j++) {
				if(a[i]==a[j])
				{
					isUnique=true;
					break;
				}
			}
			if(!isUnique)
			{
				System.out.print(a[i]+",");
			}

		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {2,3,2,5,2,6,3,5};
		
		//Bubble sorting algorithm
		for (int i = 0; i < a.length; i++) //pass count
		{
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1])
				{
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] +",");
		}
		System.out.println();
		Array_unique_elment(a);

	}

}
