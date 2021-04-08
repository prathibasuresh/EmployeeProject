package Triangle_Patterns;

public class tri_pat2 {

	public static void main(String[] args) {
		int lines=5;
		int ch=1;
		int sp=2;
		for(int i=0; i<lines;i++)
		{
			for (int j = 0; j < sp; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < ch; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<lines/2)
			{
				ch=ch+2;
				sp--;
			}
			else
			{
				ch=ch-2;
				sp++;
			}
		}

	}

}
