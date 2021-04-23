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
public class SummaryPage {
	WebDriver driver;

	public SummaryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void summaryCheckout() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
	}
	public void addressCheckout() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
	}
	public void shippingCheckbox() {
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
	}
	public void shippingCheckout() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();
	}
	public void paymentCheckout() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
	}
	public void paymentByBank() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
	}
}
