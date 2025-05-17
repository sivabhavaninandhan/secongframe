package TestingNextGenerationPractice;

import org.testng.annotations.Test;

public class groupsIntoductOne {

	@Test(groups="sanity")
	public void test5()
	{
		System.out.println("test5");
	}
	@Test(groups={"functional","sanity"})
	public void test6()
	{
		System.out.println("test6");
	}
	@Test(groups= {"regression","sanity"})
	public void test7()
	{
		System.out.println("test7");
	}
	@Test
	public void test8()
	{
		System.out.println("test8");
	}
}
