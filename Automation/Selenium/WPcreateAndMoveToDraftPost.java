package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WPcreateAndMoveToDraftPost extends boss {
	@Test
	public void test() throws Exception {

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

		log.info("Add New Post page is opened");
		System.out.println("Page title is: " + driver.getTitle());
		Thread.sleep(1000);
		WebElement postTitle = driver.findElement(By.xpath("//input[@id='title']"));
		postTitle.sendKeys("Draft Post1");
		WebElement textArea = driver.findElement(By.xpath("//html/body[1]"));
		textArea.click();
		textArea.clear();
		textArea.sendKeys("This is a post for WordPress!");
		Thread.sleep(2000);
		log.info("Post is written");
		driver.findElement(By.xpath("//input[@id='save-post']")).click();
		Thread.sleep(1000);
		log.info("New post is moved to Draft folder");
		action.moveToElement(posts).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='wp-first-item'][contains(text(),'All Posts')]")).click();
		System.out.println("Page title is: " + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'edit.php?post_status=draft&post_type=post')]")).click();
		log.info("Page with Draft posts is opened");
		driver.findElement(By.xpath("//a[contains(text(),'Draft post')]"));
		Thread.sleep(1000);
		log.info("Draft post found");
		driver.close();

	}

}
