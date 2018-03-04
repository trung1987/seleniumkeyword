package selenium.Keywords;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

/**
 * @author TrungTH_CA
 *
 */
public class AssertKeyWords {

	public static void AssertPagetitle( WebDriver driver,String str) {
		String pageTitle= driver.getTitle().toString().toLowerCase();
		assertEquals(pageTitle, str.toLowerCase(), "The pageTitle is not same with expected");
		
	}
}
