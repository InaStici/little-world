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

public class WPcreateNewPage {

	@Test
	public void test() throws Exception {

		WebDriver driver = new ChromeDriver();
		Logger log = Logger.getLogger("WPlogin");
		PropertyConfigurator.configure(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\seleniumPractice\\log4j.properties");
		BasicConfigurator.configure();

		WPloginTemplate login = new WPloginTemplate();
		login.test();

		Actions action = new Actions(driver);
		WebElement pages = driver.findElement(By.xpath("//li[@id='menu-pages']"));
		action.moveToElement(pages).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='post-new.php?post_type=page']")).click();

		log.info("Add New Page page is opened");
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(1000);

		log.info("Add New Post page is opened");
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(1000);
		WebElement pageTitle = driver.findElement(By.xpath("//input[@id='title']"));
		pageTitle.sendKeys("Page Title");
		WebElement textArea = driver.findElement(By.xpath("//html/body[1]"));
		textArea.click();
		textArea.clear();
		textArea.sendKeys("This is a page for WordPress!");
		Thread.sleep(2000);
		log.info("Page is created");
		screen(driver);
		driver.findElement(By.xpath("//input[@id='publish']")).click();
		Thread.sleep(5000);
		log.info("View created page");
		screen(driver);
		driver.close();

	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("D:\\Java\\!Automation\\Logs\\Screens\\" + this.getClass().getSimpleName() + ".png"));
	}

}
