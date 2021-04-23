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
public class AccountPage {
		WebDriver driver;


		public AccountPage(WebDriver driver) {
			this.driver=driver;
		}

		public void ClickOnMyInfo() {
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span")).click();
		}
}
