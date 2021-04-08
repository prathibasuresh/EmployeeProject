package Top10_Exptions;

import java.util.ArrayList;
import java.util.Iterator;

public class Illegal_state_exp {
	
	public static void main(String[] args) {
		//Example-1
		Thread t=new Thread();
		t.start();//thread is started here
		//t.start();// java.lang.IllegalThreadStateException
		
		//Example-2
		ArrayList<String> ls=new ArrayList<>();
		ls.add("ram");
		ls.add("shyam");
		ls.add("rani");
		ls.add("abi");
		System.out.println(ls);
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext())
		{
//			String object = itr.next();
			itr.remove();					//" java.lang.IllegalStateException
			//System.out.println(object);
		}
	
	}


}
