package TestBase;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public static WebDriver driver;
public static  ResourceBundle rb;


@Parameters("Browser")
@BeforeClass(groups= {"Maaster","Sanity","Regression"})
 /*public void setup(String br) throws IOException
 
 {
	rb=ResourceBundle.getBundle("config");
	
	
			
	if(br.equals("Chrome"))
	{
		 driver=new ChromeDriver();
	}
	else if(br.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	
	 
	
	
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	// driver.get("https://www.facebook.com/");
		// driver.get("https://demo.opencart.com/");
		 driver.get((rb.getString("localhosturl")));
	 driver.manage().window().maximize();
 }


@AfterClass(groups= {"Master","Sanity","Regression"})
/*public void Application_close()

{

	driver.quit();
}*/
 


//To generate the random number and string
	
public String Randamstring()
	{
	String  alpharandomstring=RandomStringUtils.randomAlphabetic(5);
	return(alpharandomstring);
	}
	
	public String RandomNumber()
	{
		String RandomNumber=RandomStringUtils.randomNumeric(10);
		return(RandomNumber);
		
		}
	
	
//Random AlphaNumeric Sting for Password 
	
	public String AlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(4);
		String num=RandomStringUtils.randomNumeric(3);
		return(str+"@"+num);
	}
	
	
//take a Screenshot for Test_case Failure with time stamp 
	
	public String CapctureScreen(String Tname) throws IOException
	{
		//SimpleDateFormat sp= new SimpleDateFormat("yyyymmddhhss");
		//Date db= new Date();
		
		//String timestamp=sp.format(db);
		
		String TimeStamp= new SimpleDateFormat("yyyyMMddhhmmSS").format(new Date());
		
		TakesScreenshot ScreenShoot = (TakesScreenshot) driver;
		File srcfile = ScreenShoot.getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir") + "\\Screenshoot\\" + Tname + "_" + TimeStamp + ".Png";
		
		try {
		FileUtils.copyFile(srcfile,new File(destfile));
		
		}catch(Exception e)
		
		{
			e.getMessage();
		}
		return destfile;
				
	}
}





