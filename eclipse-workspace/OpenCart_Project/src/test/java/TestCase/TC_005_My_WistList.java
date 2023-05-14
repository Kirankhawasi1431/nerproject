package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.My_WistList_Page;
import TestBase.BaseClass;

public class TC_005_My_WistList extends BaseClass {
	
	
	
	WebDriver driver;
	
	
	@Test(groups = {"Sanity1"})
	public void Test_MyWishList()
	{
		
		
		/*TC_002_LogInPage Lt= new TC_002_LogInPage();
		
		Lt.LogIn_Test();*/
		
		TC_004_ProductItemSearch_page PSP=new TC_004_ProductItemSearch_page();
		
		PSP.Test_ProductItemSearch_page();
		
		
		
	
		My_WistList_Page mwp=new My_WistList_Page(BaseClass.driver);
		
		String Verifyproductname=mwp.GetProduct_Name();
		
		
		Assert.assertEquals(Verifyproductname, "Samsung Galaxy Tab 10.1");
	
		mwp.ClickOn_AddTo_CartBtn();
	
		boolean confrmMsg=mwp.Verify_DisplayMSG();
	
		Assert.assertTrue(confrmMsg);
		mwp.ClickOn_AddCartSymbleBtn();
		/*try {
		
		}
		catch(Exception e)
		{
			e.getMessage();
		}*/
		
		
		
		
		
		
	}

}
