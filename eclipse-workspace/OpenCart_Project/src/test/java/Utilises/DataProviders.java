package Utilises;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	

	
	@DataProvider(name="loginData")
	public String[][] getdata() throws IOException
	{
		String path = ".\\TestData\\Opencart_LoginData.xlsx\\";
		
		
		ExcelUtility exlutil= new ExcelUtility(path);
		
		
		int totalrowcount=exlutil.getRowCount("Sheet1");
		int Totalcoloums=exlutil.getCellCount("Sheet1",1);   
		
		String Login_data[][] = new String[totalrowcount][Totalcoloums];
		
		for(int i=1;i<=totalrowcount;i++)
		{
			for(int j=0; j<Totalcoloums;j++)
			{
				Login_data[i-1][j]=exlutil.getCellData("Sheet",i,j);
			}
			
		}
		
		return(Login_data);		
		
		
	}

}
