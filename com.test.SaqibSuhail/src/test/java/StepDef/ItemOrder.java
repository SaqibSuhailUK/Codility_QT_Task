/**
 * 
 */
package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.OrderHistoryPage;
import Pages.SignInPage;
import Pages.SummaryPage;
import Pages.TshirtPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Saqib Suhail
 *
 * 
 */
public class ItemOrder {

	WebDriver driver = null;

	@Given("user is on login page with credentials")
	public void user_is_on_login_page_with_credentials() throws InterruptedException {
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

	@When("user completes the order of a t-shirt")
	public void user_completes_the_order_of_a_t_shirt() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TshirtPage Tshirt=new TshirtPage(driver);
		Tshirt.clicktshirt();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"))
		.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		SummaryPage Summary= new SummaryPage(driver);
		Summary.summaryCheckout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Summary.addressCheckout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,450)");
		Summary.shippingCheckbox();
		Summary.shippingCheckout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,550)");
		Summary.paymentCheckout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,1000)");
		Summary.paymentByBank();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Order is placed successfully");

	}

	@Then("verify the order in order history")
	public void verify_the_order_in_order_history() throws InterruptedException {
		OrderHistoryPage Order = new OrderHistoryPage(driver);
		Order.profile();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Order.orderHistory();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Order.verifyOrder();
		System.out.println("Order is verified in Order History");
		driver.close();
		Thread.sleep(3000);
	}
	
	}

