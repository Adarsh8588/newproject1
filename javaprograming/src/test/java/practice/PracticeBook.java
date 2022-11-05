package practice;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.torism.GenericUtilities.BaseClass;
import com.tourism.ObjectRepository.AdminHomePage;
import com.tourism.ObjectRepository.AdminLoginPage;
import com.tourism.ObjectRepository.ApplicationHomePage;
import com.tourism.ObjectRepository.UserHomePage;
import com.tourism.ObjectRepository.UserTourPackageDetailsPage;
@Listeners(com.torism.GenericUtilities.LisImpClass.class)
public class PracticeBook extends BaseClass {
	
@Test(dataProvider = "book",dataProviderClass = DataPrBookTour.class,groups = {"regression"})
	public void bookUserTourPackge(String fd,String td, String comm)throws Throwable
	{
		
		String userUsername=plib.readDataFromPropertyFile("username1");
		String userPassword=plib.readDataFromPropertyFile("password1");
		String adminUsername=plib.readDataFromPropertyFile("UserName");
		String adminPassword=plib.readDataFromPropertyFile("Password");
		String comment = elib.readDataFromExcelFile("data",3, 0);
		
		ApplicationHomePage ahp=new ApplicationHomePage(driver);
		ahp.userLogin(userUsername, userPassword);
			UserHomePage uh=new UserHomePage(driver);
			wlib.scrolldown(driver);
			uh.getUsertourdetailslink().click();
			
			driver.findElement(By.xpath("//input[@name='fromdate']")).click();
			driver.findElement(By.xpath("//a[.='"+fd+"']")).click();
			driver.findElement(By.cssSelector("[id='datepicker1']")).click();
			driver.findElement(By.xpath("//a[.='"+td+"']")).click();
			Assert.fail();
			wlib.scrolldown(driver);
			UserTourPackageDetailsPage ut=new UserTourPackageDetailsPage(driver);
			ut.getUserbookdetailscomment().sendKeys(comm);
			ut.getUserbookdetailssubmitbutton().click();
			uh.getUserpagelogout().click();
			ahp.getAdminloginpagelink().click();
			AdminLoginPage alp=new AdminLoginPage(driver);
			alp.adminlogin(adminUsername, adminPassword);
			AdminHomePage adhp=new AdminHomePage(driver);
			adhp.getAdminmanagebookinglink().click();
	
	
		 WebElement ele = driver.findElement(By.xpath("//a[.='Confirm']/..//a[@href='manage-bookings.php?bckid=37']"));
		 wlib.scrollToWebelement(driver, ele);
		ele.click();
		driver.switchTo().alert().accept();
		
		adhp.adminLogout();
		

	}


}
