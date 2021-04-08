package Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hash_map1 {
	public static void main(String[] args)
	{


	Map<Integer,String> map=new HashMap<>();
	map.put(4,"Zebra");
	map.put(1,"KukkeShiva");
	map.put(2, "Prathubha");
	map.put(3, "jhonson");
	map.put(4, "Rakshi");
	System.out.println(map);
//	int count=map.size();
//	System.out.println(count);
//	for(int i=1;i<=count;i++)
//	{
//	System.out.println(map.get(i));
//	}
	System.out.println(map.keySet());
	System.out.println(map.values());
	
	for(Object keys:map.entrySet())
	{
		System.out.println(keys);
	}
	
	Map<String,String> map2=new HashMap<>();
	map2.put("lead","Shiva");
	map2.put("junior","Prathi");
	map2.put("senier", "joel");
	System.out.println(map2);
	
	
	}
}
