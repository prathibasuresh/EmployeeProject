package Excep1_pkg_durga;

import java.io.PrintWriter;

public class throws_key {
	
	public static void dostuff() throws InterruptedException
	{
		System.out.println("from dostuff()");
		domorestuff();
	}
	
	public static void domorestuff() throws InterruptedException
	{
		System.out.println("from domorestuff()");
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
//		PrintWriter pw=new PrintWriter("abc.txt");
//		pw.println("Hello");     //FileNotFoundEception
		
		dostuff();
		
	}
	
	

}
