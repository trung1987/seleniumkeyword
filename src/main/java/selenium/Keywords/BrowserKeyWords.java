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

	public static WebDriver driver;
	public static WebDriver OpenBrowser(WebDriver driver,int browser) {
		switch (browser) {
		case Constant.RUN_Chrome_COL_NUM:
			System.out.println(Constant.narrow+"\nopen Chrome");
			driver=openChrome();
			break;
		case Constant.RUN_FF_COL_NUM:
			driver=openFF();
			System.out.println(Constant.narrow+"\nopen FF");		
			break;
					
		case Constant.RUN_IE_COL_NUM:
			System.out.println(Constant.narrow+"\nopen IE");
			driver=openIE();
			break;	
		default:
			break;
		}
		return driver;
	}
	
	public static WebDriver openFF() {
		FirefoxDriverManager.getInstance().setup();
		driver = new FirefoxDriver();
		return driver;
		
	}
	
	public static WebDriver openIE() {
		InternetExplorerDriverManager.getInstance().setup();
		driver = new InternetExplorerDriver();
		return driver;
		
	}
	public static WebDriver openChrome() {
		ChromeDriverManager.getInstance().setup();
		// SSL Certificate Error Handling in Chrome
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();
		handlSSLErr.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new ChromeDriver(handlSSLErr);
		return driver;
	}
}
