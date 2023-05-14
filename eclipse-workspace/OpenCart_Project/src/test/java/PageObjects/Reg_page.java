package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reg_page extends BasePage {
	
	WebDriver driver;
	
	
	public Reg_page(WebDriver driver)
	{
		super(driver);
	
	}
	
	
	//Locators Elements 
	
	@FindBy(name="firstname")
	WebElement First_name;
	
	@FindBy(name="lastname")
	WebElement Last_Name;
	
	@FindBy(id="input-email")
	WebElement Email_Fild;
	
	@FindBy(name="telephone")
	WebElement Tel_no;
	
	@FindBy(name="password")
	WebElement Password_fild;
	
	@FindBy(name="confirm")
	WebElement confPassword_fild;

	

	@FindBy(name="agree")
	WebElement Check_Box;
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	WebElement Click_continue;	
	
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement Conf_msg;	
	
	
//Action Methods of locators Elements 
	
	 public void Set_FirstName(String FirstNam)
	    {
		 First_name.sendKeys(FirstNam);
	    }
	 
	 public void Set_LastName(String LastName)
	    {
		 Last_Name.sendKeys(LastName);
	    }
	 
	  public void SetEmail(String Email)
		    {
		 
			 Email_Fild.sendKeys(Email);
			 
		    }
		 
	 public void SetTel_Num(String TelPhoneNO)
		    {
		 
		 Tel_no.sendKeys(TelPhoneNO);
		    }
	    
	  

		 public void Setpassword(String password)
		    {
			 Password_fild.sendKeys(password);
		    }
		 
		 public void Setcnfpassword(String password)
		    {
			 confPassword_fild.sendKeys(password);
		    }
	 
	 
		 public void Check_Box1()
		    {
			 
			 Check_Box.click();

		    }
		 
		public void Continue_Btn()
		    {
			
			 Click_continue.click();

		    }
		
		public String Get_Confration_msg()
	    {
			try {
				
				return (Conf_msg.getText());
				
			}
			
			catch (Exception e ) {
				return(e.getMessage());
			}			 
		 
	  }	

}
