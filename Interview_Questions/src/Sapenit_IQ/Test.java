package Sapenit_IQ;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> colors=new HashMap();
		colors.put(new Integer(0),"blue");
		colors.put(new Integer(1),"red");
		colors.put(new Integer(1),"green");
		System.out.println(colors.get(1));
	}
	

}
