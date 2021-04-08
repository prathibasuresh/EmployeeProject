package Triangle_Patterns;

public class tri_pat3 {

	public static void main(String[] args) {
		int lines=3;
		int ch=5;
		int sp=0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ch; j++) {
				System.out.print("*");
			}
			System.out.println();
			sp++;
			ch-=2;
		}
	}

}
