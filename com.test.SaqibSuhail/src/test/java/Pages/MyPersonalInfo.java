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
public class MyPersonalInfo {
	WebDriver driver;


	public MyPersonalInfo(WebDriver driver) {
		this.driver=driver;
	}

	public void UpdateUsername() {
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("xyz");
	}
	public void CurrentPassword() {
		driver.findElement(By.xpath("//*[@id=\"old_passwd\"]")).sendKeys("abc@123");
	}
	public void ClickSave() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button/span")).click();	
	}
}
