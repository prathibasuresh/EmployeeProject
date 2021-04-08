package OnlineTest;

public class test1 {

	public static void main(String[] args) {
//		 int i;
//	        do {
//	            i++;   //CTE
//	        }
//	        while(i < 0);
//	        System.out.println(i);
		System.out.println("==================");
		for(int i = 1; i < 4; i++)
			  for(int j = 1; j < 4; j++)
			    if(i < j)
			       assert i!=j : i; 
		System.out.println("==================");
		
//		int i,j,k,l=0;
//		k = l++;
//		j = ++k;
//		i = j++;
//		System.out.println(i);	
		
		for(int i = 1; i < 3; i++)
			  for(int j = 3; j >= 1; j--)
			     assert i!=j : i; 
		
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t || ((i++) == 0));
		System.out.println(i);
		System.out.println(b);
		System.out.println(i+=2 );
		b = (f || ((i+=2) > 0));
		System.out.println(b);
		System.out.println(i);
	}
	

}
