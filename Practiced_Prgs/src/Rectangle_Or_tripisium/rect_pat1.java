package Rectangle_Or_tripisium;

public class rect_pat1 {

	public static void main(String[] args) {
		int lines=4;
		int sp=0;
		int ch=1;
		for (int i = 0; i < lines; i++) 
		{
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ch; j++) {
				System.out.print("*");
			}
			System.out.println();
			ch=ch+2;
		}

	}

}
