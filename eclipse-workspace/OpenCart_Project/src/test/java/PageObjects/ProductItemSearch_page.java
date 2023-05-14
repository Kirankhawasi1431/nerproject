package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductItemSearch_page extends BasePage{
	
	public WebDriver driver;
	
	
	
	
	public ProductItemSearch_page(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	//Elements 
	
	@FindBy (xpath="//button[@data-original-title=\"Add to Wish List\"]")
	WebElement AddTo_WishList;
	
	@FindBy (xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
	WebElement Get_Msg;
	
	@FindBy (xpath="//a[@id=\"wishlist-total\"]")
	WebElement GoTo_WishList;
	
	
	
	
	//Action Method
	
	public void ClickOn_WishLisBtn()
	{
		AddTo_WishList.click();
	}
	
	public boolean Get_Conformation_Msg()
	{
		boolean msg=Get_Msg.isDisplayed();
	
	return(msg);
}
	
	public void ClickOn_WishList()
	{
		GoTo_WishList.click();
	}

}
