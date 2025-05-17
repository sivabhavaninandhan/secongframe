package GroupsInTestNGintro;

import org.testng.annotations.Test;

public class groupTestOne {
	
	@Test(groups= {"sanity"})
	public void test5()
	{
		System.out.println("this is test5");
	}
	@Test(groups= {"somke","regression"})
	public void test6()
	{
		System.out.println("this is test5");
	}

}
