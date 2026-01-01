package testNG_Part;

import org.testng.annotations.Test;

import genericUtility.BaseClass_Utilities;

public class SampleMethods extends BaseClass_Utilities{

	@Test(groups="smoke")
	public void sample()
	{
		System.out.println("Sample m1");
	}
	
	@Test(groups="smoke")
	public void sample2()
	{
		System.out.println("Sample m2");
	}
	
	@Test(groups="reg")
	public void sample3()
	{
		System.out.println("Sample 3");
		for(int i=0;i<7;i++)
		{
			System.out.println(i);
			System.out.println("Happy new year 2026!!!");
			System.out.println("Best Wishes");
			System.out.println("01-01-2026");
		}
	}

	
}
