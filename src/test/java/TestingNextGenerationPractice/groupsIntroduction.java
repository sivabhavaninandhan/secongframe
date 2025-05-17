package TestingNextGenerationPractice;

import org.testng.annotations.Test;

public class groupsIntroduction {
	
	@Test(groups="sanity")
	public void test1()
	{
		System.out.println("test1");
	}
   @Test(groups= {"sanity","smoke"})
   public void test2()
   {
	 System.out.println("test2"); 
   }
   @Test(groups="regression")
   public void test3()
   {
	   System.out.println("test3");
   }
   @Test(groups= {"smoke","regression"})
   public void test4()
   {
	   System.out.println("test4");
   }
}
