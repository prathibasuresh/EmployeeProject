package Square_Pattterns;

public class p1 {

	public static void main(String[] args) {
		int lines=4;
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<lines;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}
				
}


