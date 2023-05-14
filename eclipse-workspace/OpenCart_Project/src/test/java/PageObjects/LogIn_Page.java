package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn_Page extends BasePage{
	WebDriver driver;
	
	
	public LogIn_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy (id="input-email")
	WebElement User_Name;
	
	@FindBy (name="password")
    WebElement PassWord_Nme;
	
	@FindBy (xpath="//input[@value='Login']")
    WebElement LogIn_Btne;
	

	



public void SetUserName (String UserName)

	{
		User_Name.sendKeys(UserName);
	}
	

public void SetPassWord (String PassWord)
	{
		PassWord_Nme.sendKeys(PassWord);	
	}
	public void Clickon_logInBtn()
	{
		LogIn_Btne.click();
	}
	
	
	
	
}



	

