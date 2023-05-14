package TestCase;




import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Reg_page;
import TestBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{
	
	public WebDriver driver;

@Test(groups= {"Sanity"})
public void Home_Page_Test()
{
	
	HomePage hp= new HomePage(BaseClass.driver);
	
	hp.Click_MyAccount();
	hp.Click_RegBtn();
	
	
	
	Reg_page rp= new Reg_page(BaseClass.driver);
	
	rp.Set_FirstName(Randamstring());
	
	rp.Set_LastName(Randamstring());
	
	rp.SetEmail(Randamstring()+"@gmail.com");
	
	rp.SetTel_Num(RandomNumber());
	
	String password=  AlphaNumeric();
	
	rp.Setpassword(password);

	rp.Setcnfpassword(password);
	
	//rp.Redio_Btn();
	rp.Check_Box1();
	rp.Continue_Btn();
	String msg=rp.Get_Confration_msg();
	Assert.assertEquals(msg, "Your Account Has Been Created!");
	
	
	
	
	
}
}


	

 
 

