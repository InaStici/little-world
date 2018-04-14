package seleniumPractice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WPlogin {
	final static Logger log = Logger.getLogger(WPlogin.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		driver.get("http://tim.webtic.info/tim14/");
		log.info("Welcome to WordPress!");
		WebElement element = driver.findElement(By.xpath("//a[@href=\'http://tim.webtic.info/tim14/wp-login.php\']"));
		element.click();

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
			public String apply(WebDriver d) {
				return d.getTitle();
			}
		});

		WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));
		login.sendKeys("in@stici");
		log.info("Login inserted");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='user_pass']"));
		pwd.sendKeys("Umidigiz1");
		log.info("Password inserted");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		// Now submit the form. WebDriver will find the form for us from the element
		loginButton.submit();
		log.info("Logged in successfully!");

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		WebElement admBarMyAcct = driver.findElement(By.xpath("//html//li[@id='wp-admin-bar-my-account']/a[1]"));
		action.moveToElement(admBarMyAcct)
				.moveToElement(driver.findElement(By.xpath("//li[@id='wp-admin-bar-logout']"))).click().build()
				.perform();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
			public String apply(WebDriver d) {
				return d.getTitle();
			}
		});
		System.out.println("Page title is: " + driver.getTitle());
		log.info("Logged out successfully!");
		// Close the browser
		driver.quit();

	}

}
