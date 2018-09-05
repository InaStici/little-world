package seleniumPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WPcreateAndDeletePage extends boss {

	@Test
	public void test() throws Exception {

		WPloginTemplate login = new WPloginTemplate();
		login.test();

		Actions action = new Actions(driver);
		// div[@class='wp-menu-name'][contains(text(),'Pages')]
		WebElement pages = driver.findElement(By.xpath("//div[contains(text(),'Pages')]"));

		pages.click();
		System.out.println("Page title is: " + driver.getTitle());
		WebElement addNewBtn = driver.findElement(By.xpath("//a[contains(@class,'page-title-action')]"));
		addNewBtn.click();

		log.info("\"Add New Page\" page is opened");
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(1000);

		// log.info("Add New Post page is opened");
		// System.out.println("Page title is: " + driver.getTitle());
		// Thread.sleep(1000);
		WebElement pageTitle = driver.findElement(By.xpath("//input[@id='title']"));
		pageTitle.sendKeys("Page to delete");
		WebElement textArea = driver.findElement(By.xpath("//html/body[1]"));
		textArea.click();
		textArea.clear();
		textArea.sendKeys("This is a new page for WordPress!");
		Thread.sleep(2000);
		log.info("Page is created");
		screen(driver);
		driver.findElement(By.xpath("//a[contains(@class,'submitdelete deletion')]")).click();
		driver.switchTo().alert().accept();
		log.info("Go back to all pages");
		System.out.println("Page title is: " + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'edit.php?post_status=trash&post_type=page')]")).click();
		log.info("Open Bin page");
		WebElement pageTitleInTable = driver.findElement(By.xpath("//strong[contains(text(),'Page to delete')]"));
		screen(driver);
		Thread.sleep(1000);
		driver.close();

	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,
				new File("D:\\Java\\!Automation\\Logs\\Screens\\" + this.getClass().getSimpleName() + ".png"));
	}

}
