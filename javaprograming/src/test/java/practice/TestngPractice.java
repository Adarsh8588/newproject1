package practice;

import org.testng.annotations.Test;

public class TestngPractice {
@Test(priority = 1)
public void createtourPackage()
{
	System.out.println("Tour package is created");
}

@Test(enabled = false)
public void modifyTourPackage()
{
	System.out.println("Tour package is modified");
}

@Test(priority = 2)
public void deleteTourPackage()
{
	System.out.println("Tour package is deleted");
}
@Test(invocationCount = 3)
public void deleteTourPackage2()
{
	System.out.println("Tour package is deleted");
}
@Test(invocationCount = 0)
public void deleteTourPackage3()
{
	System.out.println("Tour package is deleted");
}

@Test
public void createtourPackage1()
{
	System.out.println("Tour package is created");
	int []arr= {2,3,2};
	System.out.println(arr[5]);
}

@Test(dependsOnMethods = "createtourPackage1")
public void modifyTourPackage1()
{
	System.out.println("Tour package is modified");
}

@Test(dependsOnMethods = "modifyTourPackage1")
public void deleteTourPackage1()
{
	System.out.println("Tour package is deleted");
}


}
