package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LogIn_Page;
import PageObjects.MyAccount_Page;
import TestBase.BaseClass;
import Utilises.DataProviders;

public class TC_03_LogIn_DDD extends BaseClass{
	
	public WebDriver driver;
	
	
	@Test(dataProvider="loginData", dataProviderClass= DataProviders.class)
	public void Test_login  (String email, String Psw, String exp)
	
	{
		HomePage hp = new HomePage(BaseClass.driver);
		hp.Click_MyAccount();
		hp.Click_LogIn();
		
		LogIn_Page lp= new LogIn_Page(BaseClass.driver);
		 
		 lp.SetUserName(email);
		 
		 lp.SetPassWord(Psw);
		 
		 lp.Clickon_logInBtn();
	
		 
		 MyAccount_Page mp=new MyAccount_Page (BaseClass. driver);
		 
		 boolean verify= mp. Verification_MyAccountPage();
		 
		 try {
		 if (exp.equals("Valid")) {
				if (verify == true) {
					mp.Clickon_logOutBtn();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) {
				if (verify == true) {
					MyAccount_Page Mypage = new MyAccount_Page(BaseClass.driver);
					Mypage.Clickon_logOutBtn();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}
}
	
}
