/**
 * 
 */
package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.AccountPage;
import Pages.MyPersonalInfo;
import Pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Saqib Suhail
 *
 * 
 */
public class EditName {
	WebDriver driver=null;
	
	@Given("user is on login page with credentials again")
	public void user_is_on_login_page_with_credentials_again() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		SignInPage Signin = new SignInPage(driver);
		Signin.enterUsername();
		Signin.enterPassword();
		Signin.signIn();
		Thread.sleep(3000);
		System.out.println("User has successfully logged in");
	}

	@When("user updates the first name")
	public void user_updates_the_first_name() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		AccountPage Account = new AccountPage(driver);
		Account.ClickOnMyInfo();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,500)");
		MyPersonalInfo MyInfo = new MyPersonalInfo(driver);
		MyInfo.UpdateUsername();
		MyInfo.CurrentPassword();
		System.out.println("Name has been updated");
	}

	@Then("save the updated information")
	public void save_the_updated_information() {
		MyPersonalInfo MyInfo = new MyPersonalInfo(driver);
		MyInfo.ClickSave();
		System.out.println("Name has been saved");
		driver.close();
	}

}
