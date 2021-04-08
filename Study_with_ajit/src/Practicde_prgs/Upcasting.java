package Practicde_prgs;

public class Upcasting {

	public static void main(String[] args) {
		 //Tester t1=new Sample();
		  Tester t2=new Cool();
		  System.out.println(t2.x);
		
		  Sample s=(Sample)t2;
		  s.Disp();
		 
		  Tester t3=new Tester();
		  System.out.println(t3.x);
		  
		 
		 

	}

}
