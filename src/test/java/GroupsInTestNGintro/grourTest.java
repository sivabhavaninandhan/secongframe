package GroupsInTestNGintro;

import org.testng.annotations.Test;

public class grourTest {
	@Test(groups= {"smoke"})
	public void test1()
	{
		System.out.println("this is Test1");
	}

	@Test(groups= {"smoke","sanoty"})
	public void test2()
	{
		System.out.println("this is Test2");
	}
	@Test(groups= {"smoke","regression","sanity"})
	public void test3()
	{
		System.out.println("this is test3");
	}
    @Test
    public void test4()
    {
    	System.out.println("this is test4");
    }
}
