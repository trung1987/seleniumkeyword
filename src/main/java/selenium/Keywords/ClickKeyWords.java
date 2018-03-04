/**
 * 
 */
package selenium.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author TrungTH_CA
 *
 */
public class ClickKeyWords {

	public static void ClickonButton(WebDriver driver,String FindBy, String ByValue) {
		WebElement ele= FindElementsKeyWords.findElemnt(driver, FindBy, ByValue);
		if(ele==null) {
			System.out.println("Cannot find this element " + ByValue);
		} else ele.click();
	}
}
