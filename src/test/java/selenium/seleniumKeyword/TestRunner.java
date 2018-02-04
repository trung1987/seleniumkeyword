package selenium.seleniumKeyword;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import selenium.Utils.Constant;
import selenium.Utils.ReadExcel;

public class TestRunner {
	WebDriver driver;
	
	@Test
	public void TestApp() throws RuntimeException, Exception{
		driver=ReadExcel.ReadAll(Constant.File_name);
		
	}
	
	@AfterTest
	public void TearDown(){
		//driver.quit();
	}
}
