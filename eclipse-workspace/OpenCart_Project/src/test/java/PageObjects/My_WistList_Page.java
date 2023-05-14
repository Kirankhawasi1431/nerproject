package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_WistList_Page extends BasePage{
	
	
	
	  
	
	WebDriver driver;
	
		
	public My_WistList_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy (xpath="//td[@class=\"text-left\"]//a")
	WebElement Product_Name;
	
	@FindBy (xpath="//a[@id=\"wishlist-total\"]")
	WebElement AddTo_Cart;
	
	@FindBy (xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
	WebElement Verify_AddCart;
	
	@FindBy (xpath="//a[@title=\"Shopping Cart\"]")
	WebElement GoTo_AddCartSymble;
	
	
	
	public String GetProduct_Name()
	{
		String Productname=Product_Name.getDomAttribute("a");
		
		return (Productname);	
	}
	
	
	public void ClickOn_AddTo_CartBtn()
	{
		AddTo_Cart.click();
	}
	
	public boolean Verify_DisplayMSG()
	{
		boolean verifymsg=Verify_AddCart.isDisplayed();
		
		return (verifymsg);
	}
	
	
	
	public void ClickOn_AddCartSymbleBtn()
	{
		GoTo_AddCartSymble.click();
	}
	
	
	
}





