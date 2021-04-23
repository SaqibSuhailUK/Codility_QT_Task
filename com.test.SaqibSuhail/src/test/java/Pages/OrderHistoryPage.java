/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Saqib Suahil
 *
 * 
 */
public class OrderHistoryPage {
	WebDriver driver;


	public OrderHistoryPage(WebDriver driver) {
		this.driver=driver;
	}

	public void profile() {
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")).click();
	}
	public void orderHistory() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a/span")).click();
	}
	public void verifyOrder() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[1]/a")).isDisplayed();
	}
}
