import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WPlogin {
	@Test
	public void test() throws Exception {

		Logger log = Logger.getLogger("WPlogin");
		PropertyConfigurator.configure(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\seleniumPractice\\log4j.properties");
		BasicConfigurator.configure();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(
				"http://tim.webtic.info/tim14/wp-login.php?redirect_to=http%3A%2F%2Ftim.webtic.info%2Ftim14%2Fwp-admin%2F&reauth=1");
		log.info("Welcome to WordPress!");

		WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));
		login.sendKeys("in@stici");
		log.info("Login inserted");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='user_pass']"));
		pwd.sendKeys("Umidigiz1");
		log.info("Password inserted");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		// Now submit the form. WebDriver will find the form for us from the element
		loginButton.submit();
		log.info("Logged in successfully!");

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
			public String apply(WebDriver d) {
				return d.getTitle();
			}
		});
		System.out.println("Page title is: " + driver.getTitle());
		log.info("Logged out successfully!");
		screen(driver);
		Thread.sleep(3000);
		driver.quit();

	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("D:\\Java\\!Automation\\Logs\\Screens\\" + this.getClass().getSimpleName() + ".png"));
	}

}
