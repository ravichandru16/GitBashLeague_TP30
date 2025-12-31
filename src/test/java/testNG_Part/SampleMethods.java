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
	}

	
}
