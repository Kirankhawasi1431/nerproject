package TestCase;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LogIn_Page;
import PageObjects.MyAccount_Page;

import TestBase.BaseClass;

public class TC_002_LogInPage extends BaseClass{
	
	WebDriver driver;
	
@Test(groups= {"Regression","Sanity"})
public void LogIn_Test()

	{
	
	HomePage hp = new HomePage(BaseClass.driver);
	hp.Click_MyAccount();
	hp.Click_LogIn();
	
	 LogIn_Page lp= new LogIn_Page(BaseClass.driver);
	 
	 lp.SetUserName(rb.getString("email"));
	 
	 lp.SetPassWord(rb.getString("password"));
	 
	 lp.Clickon_logInBtn();
	 
	 MyAccount_Page mp=new MyAccount_Page (BaseClass. driver);
	 
	 boolean verify= mp. Verification_MyAccountPage();
	 
	 Assert.assertEquals(verify,true);
	 
	mp.Search_Product(rb.getString("product1"));
	mp.Search_BtnClick();
	

	 
		
	}
	
	
	
	
	
	

}
