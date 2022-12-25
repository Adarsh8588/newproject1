package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
//@Test(retryAnalyzer = com.torism.GenericUtilities.RetryImplimentationClass.class)
	public void retry()
	{
		System.out.println("---test1-----");
		System.out.println("---test2-----");
		Assert.fail();
		System.out.println("---test3-----");
		System.out.println("---test4-----");
		
	}
}
