package seleniumPractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WPInviteUser extends boss {

	@Test
	public void test() throws Exception {

		WPloginTemplate login = new WPloginTemplate();
		login.test();

		Actions action = new Actions(driver);

		WebElement users = driver.findElement(By.xpath("//div[contains(text(),'Users')]"));
		action.moveToElement(users).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='user-new.php']")).click();
		log.info("\"Add New User\" page is opened");
		System.out.println("Page title is: " + driver.getTitle());

		WebElement userNameInputField = driver.findElement(By.xpath("//input[@id='user_login']"));
		WebElement emailInputField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement firstNameInputField = driver.findElement(By.xpath("//input[@id='first_name']"));
		WebElement LastNameInputField = driver.findElement(By.xpath("//input[@id='last_name']"));
		WebElement showPasswordButton = driver.findElement(By.xpath("//button[contains(text(),'Show password')]"));
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='pass1-text']"));
		WebElement createUserBtn = driver.findElement(By.xpath("//input[@id='createusersub']"));

		Select role = new Select(driver.findElement(By.xpath("//select[@id='role']")));
		Map<String, String> rolesMap = new HashMap<String, String>();
		rolesMap.put("subscriber", "Subscriber");
		rolesMap.put("contributor", "Contributor");
		rolesMap.put("author", "Author");
		rolesMap.put("editor", "Editor");
		rolesMap.put("administrator", "Administrator");

		userNameInputField.sendKeys("user11");
		log.info("User name entered: \"user11\"");
		emailInputField.sendKeys("sty4onak94@mail.ru");
		log.info("Email entere: \"sty4onak94@mail.ru\"");
		firstNameInputField.sendKeys("User First Name");
		log.info("First name entered: \"User First Name\"");
		LastNameInputField.sendKeys("User Last Name");
		log.info("Last name entered: \"User Last Name\"");
		showPasswordButton.click();
		passwordTextField.getText();
		log.info("Password stored: " + passwordTextField.getText());
		role.selectByVisibleText(rolesMap.get("author"));
		log.info("Role selected: " + rolesMap.get("author"));
		createUserBtn.click();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
			@Override
			public String apply(WebDriver d) {
				return d.getTitle();
			}
		});
		System.out.println("Page title is: " + driver.getTitle());
		log.info("Invite sent!");

		WebElement userPresense = driver.findElement(By.xpath("//a[contains(text(),'user1')]"));
		userPresense.click();
		log.info("Edit User1 page opened. User Options are displayed");

	}
}
