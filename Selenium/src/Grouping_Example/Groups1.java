package Grouping_Example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups1 {
	
	@Test(groups= {"Sanity"})
	public void test1()
	{
		Reporter.log("This is test1",true);
	}
	
	@Test(groups= {"Sanity"})
	public void test2()
	{
		Reporter.log("This is test2",true);
	}
	@Test(groups= {"Regression"})
	public void test3()
	{
		Reporter.log("This is test3",true);
	}
	@Test(groups= {"Regression"})
	public void test4()
	{
		Reporter.log("This is test4",true);
	}
	@Test(groups= {"Sanity","Regression"})
	public void test5()
	{
		Reporter.log("This is test5",true);
	}

}
