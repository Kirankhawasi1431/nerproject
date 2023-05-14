package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Page extends  BasePage 
{
	
	WebDriver driver;
	
	public MyAccount_Page(WebDriver driver)
	{
		super(driver);
		}
	
	
	@FindBy (xpath ="//h2[text()=\"My Account\"]")
	WebElement MyAccount_Exist;
	
	@FindBy (name ="search")
	WebElement SearchcBtn;
	
	@FindBy (xpath="//*[@id=\"column-right\"]/div/a[13]")
	WebElement Log_Out;
	
	@FindBy (xpath ="//*[@id=\"search\"]/span/button")
	WebElement SearchcBtn_click;
	
	
	
	
	public boolean Verification_MyAccountPage()
	{
		try {
			return (MyAccount_Exist.isDisplayed());
			
		}catch(Exception e)
		
		{ 
			return (false);
		}
				
	}
	
	public void Search_Product(String Product)
	{
		SearchcBtn.sendKeys(Product);
		
	}
	
	public void Clickon_logOutBtn()
	{
		Log_Out.click();
	}
	

	public void Search_BtnClick()
	{
		SearchcBtn_click.click();
		
	}
	

	
	
}

