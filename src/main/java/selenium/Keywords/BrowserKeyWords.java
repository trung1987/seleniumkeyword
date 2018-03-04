/**
 * 
 */
package selenium.Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import selenium.Utils.Constant;

/**
 * @author TrungTH_CA
 *
 */
public class BrowserKeyWords {

	public static WebDriver OpenBrowser(int browser) {
		WebDriver driver=null;
		switch (browser) {
		case Constant.RUN_Chrome_COL_NUM:
			System.out.println(Constant.narrow+"\nopen Chrome");
			driver=openChrome(driver);
			break;
		case Constant.RUN_FF_COL_NUM:
			driver=openFF(driver);
			System.out.println(Constant.narrow+"\nopen FF");		
			break;
		case Constant.RUN_IE_COL_NUM:
			System.out.println(Constant.narrow+"\nopen IE");
			driver=openIE(driver);
			break;	
		default:
			break;
		}
		return driver;
	}
	
	public static WebDriver openFF(WebDriver driver) {
		FirefoxDriverManager.getInstance().setup();
		driver = new FirefoxDriver();
		return driver;
		
	}
	
	public static WebDriver openIE(WebDriver driver) {
		InternetExplorerDriverManager.getInstance().setup();
		driver = new InternetExplorerDriver();
		return driver;
		
	}
	public static WebDriver openChrome(WebDriver driver) {
		ChromeDriverManager.getInstance().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void GotoURL(WebDriver driver, String url) {
		System.out.println(Constant.narrow+"\n=----"+url);
		driver.get(url);
	}
	
	public static void Quit(WebDriver driver) {
		driver.quit();
	}
}
