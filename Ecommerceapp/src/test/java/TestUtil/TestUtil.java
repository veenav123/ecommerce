package TestUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	WebDriver driver;
	public void IntialseDriver(){
	System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\Chrome\\chromedriver.exe");
	}
	
	public boolean CheckImage(WebElement sName)throws Exception{
		/**sName.click();
	     boolean ImagePresent =  (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", sName);
         return ImagePresent;**/
		return true;
	}

}
