/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Saqib Suhail
 *
 * 
 */
public class TshirtPage {

	WebDriver driver;
	
	public TshirtPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clicktshirt() {
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
	}
}

