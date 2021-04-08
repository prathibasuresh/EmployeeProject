
public class static_block_with_final_keyword {
	public static final int x=10;
	static {
		System.out.println("From static block");
	}

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println("From main");

	}

}
