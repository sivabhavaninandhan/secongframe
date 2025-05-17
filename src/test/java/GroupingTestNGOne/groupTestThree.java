package GroupingTestNGOne;

import org.testng.annotations.Test;

public class groupTestThree {
	@Test(groups= {"smoke","sanity"})
	public void test5()
	{
		System.out.println("this is test5");
	}
 @Test(groups= {"regression"})
 public void test6()
 {
	 System.out.println("this test6");
 }
 @Test
 public void test7()
 {
	 System.out.println("this is test7");
 }
 @Test(groups= {"smoke","regressin","functional"})
 public void test8()
 {
	 System.out.println("this is test8");
 }
}
