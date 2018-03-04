/**
 * 
 */
package selenium.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author LENOVO
 *
 */
public class FindElementsKeyWords {

	public static WebElement findElemnt(WebDriver driver, String FindBy, String ByValue ) {
		WebElement ele=null;
		switch (FindBy) {
		case "By Id":
			ele=driver.findElement(By.id(ByValue));
			break;
		case "By Name":
			ele=driver.findElement(By.name(ByValue));
			break;
		case "By Xpath":
			ele=driver.findElement(By.xpath(ByValue));
			break;
		default:
			break;
		}
		return ele;
	}
	
}
