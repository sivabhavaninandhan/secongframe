package GroupingTestNGOne;

import org.testng.annotations.Test;

public class groupTestTwo {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("this is test1");
	}
		
	@Test(groups={"regression","smoke"})
	public void test2()
	{
		System.out.println("this is test2");
	}

	@Test(groups= {"smoke","sanity"})
	public void test3()
	{
		System.out.println("this test3");
	}
	@Test
	public void test4()
	{
		System.out.println("this is test4");
	}
}

