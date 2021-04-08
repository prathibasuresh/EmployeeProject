package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(10);
		System.out.println(al);
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
