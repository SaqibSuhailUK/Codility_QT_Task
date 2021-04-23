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
public class SignInPage {
	WebDriver driver;


	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterUsername() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@mail.com");
	}

	public void enterPassword() {
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("abc@123"); 
	}

	public void signIn() { 
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click(); 
	}

}
