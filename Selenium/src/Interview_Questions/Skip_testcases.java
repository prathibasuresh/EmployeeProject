package Interview_Questions;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_testcases {
	
	private static final boolean DataAvailable = false;

	@Test
	public void test1()
	{
		System.out.println("From test1");
	}
	

	@Test(enabled=false)
	public void test2()
	{
		System.out.println("From test2");
	}
	

	@Test
	public void test3()
	{
		System.out.println("From test3");
	}
	
	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		if(DataAvailable)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

}
