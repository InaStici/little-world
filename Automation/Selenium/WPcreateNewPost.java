package seleniumPractice;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WPcreateNewPost {

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
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));
		login.sendKeys("in@stici");
		log.info("Login inserted");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='user_pass']"));
		pwd.sendKeys("Umidigiz1");
		log.info("Password inserted");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		// Now submit the form. WebDriver will find the form for us from the element
		loginButton.submit();
		log.info("Logged in successfully!");

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		Actions action = new Actions(driver);
		WebElement posts = driver.findElement(By.xpath("//li[@id='menu-posts']"));
		action.moveToElement(posts).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='post-new.php']")).click();
		// posts.click();
		// WebElement addNewPost = driver.findElement(By
		// .xpath("//a[@href='http://tim.webtic.info/tim14/wp-admin/post-new.php'][contains(text(),'Add
		// New')]"));
		// addNewPost.click();
		log.info("Add New Post page is opened");
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(1000);
		WebElement postTitle = driver.findElement(By.xpath("//input[@id='title']"));
		postTitle.sendKeys("Title1");
		WebElement textArea = driver.findElement(By.xpath("//html/body[1]"));
		textArea.click();
		textArea.clear();
		textArea.sendKeys("This is a post for WordPress!");
		Thread.sleep(2000);
		log.info("Post is written");
		screen(driver);

	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("D:\\Java\\!Automation\\Logs\\Screens\\" + this.getClass().getSimpleName() + ".png"));
	}

}
