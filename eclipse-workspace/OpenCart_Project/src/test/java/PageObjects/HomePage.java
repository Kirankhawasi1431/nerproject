package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	
	
	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	

	@FindBy(xpath = "//span[text()=\"My Account\"]")
	WebElement Click_LogIn_Btn;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	WebElement Click_regNmae;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	WebElement Log_in;
	
	
	


	
	 public void Click_MyAccount()
	    {
		 Click_LogIn_Btn.click();
	    }

	    
	    public void Click_RegBtn()
	    {
	    	Click_regNmae.click();
	    }  
	    
	    public void Click_LogIn()
	    {
	    	Log_in.click();
	    }  
}
