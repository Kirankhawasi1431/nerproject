package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LogIn_Page;
import PageObjects.MyAccount_Page;
import PageObjects.ProductItemSearch_page;

import TestBase.BaseClass;

public class TC_004_ProductItemSearch_page extends BaseClass {
	
	
	
	public WebDriver driver;
	
	
	@Test(groups="Sanity2")
	public void Test_ProductItemSearch_page()
	{
		
		

		TC_002_LogInPage Lt= new TC_002_LogInPage();
		
		Lt.LogIn_Test();
		
		/*HomePage hp = new HomePage(BaseClass.driver);
		hp.Click_MyAccount();
		hp.Click_LogIn();
		
		 LogIn_Page lp= new LogIn_Page(BaseClass.driver);
		 
		 lp.SetUserName(rb.getString("email"));
		 
		 lp.SetPassWord(rb.getString("password"));
		 
		 lp.Clickon_logInBtn();
		 
		 MyAccount_Page mp=new MyAccount_Page (BaseClass. driver);
		 mp.Search_Product(rb.getString("product1"));
			mp.Search_BtnClick();*/
		 
		 
			ProductItemSearch_page pi=new ProductItemSearch_page(BaseClass.driver);
		
		pi.ClickOn_WishLisBtn();
		boolean confmmsg=pi.Get_Conformation_Msg();
		System.out.println("WistList conformation is:"+confmmsg);
		pi.ClickOn_WishList();
			
	}

}
