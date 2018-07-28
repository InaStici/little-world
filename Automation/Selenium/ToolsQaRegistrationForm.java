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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToolsQaRegistrationForm {

	@Test
	public void test() throws Exception {

		Logger log = Logger.getLogger("WPlogin");
		PropertyConfigurator.configure(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\seleniumPractice\\log4j.properties");
		BasicConfigurator.configure();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demoqa.com/registration/");
		log.info("DemoQA registration form");

		WebElement firstName = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_3_lastname']"));
		WebElement maritalStatusSingle = driver.findElement(By.xpath("//input[@value='single']"));
		WebElement hobbyReading = driver.findElement(By.xpath("//input[@value='reading']"));
		Select country = new Select(driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		Select dobMonth = new Select(driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		Select dobDay = new Select(driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		Select dobYear = new Select(driver.findElement(By.xpath("//select[@id='yy_date_8']")));
		WebElement phoneNr = driver.findElement(By.xpath("//input[@id='phone_9']"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email_1']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password_2']"));
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirm_password_password_2']"));
		WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Submit']"));
		WebElement selectFileBtn = driver.findElement(By.xpath("//input[@id='profile_pic_10']"));

		firstName.sendKeys("Ina");
		log.info("First name entered");
		lastName.sendKeys("Stici");
		log.info("Last name entered");
		maritalStatusSingle.click();
		log.info("Marital status selected");
		hobbyReading.click();
		log.info("Hobby selected");
		country.selectByVisibleText("Moldova");
		log.info("Country selected");
		dobMonth.selectByVisibleText("1");
		log.info("Month of birth selected");
		dobDay.selectByVisibleText("10");
		log.info("Day of birth selected");
		dobYear.selectByVisibleText("1994");
		log.info("Year of birth selected");
		phoneNr.sendKeys("37369466062");
		log.info("Phone number entered");
		userName.sendKeys("inastici_user1");
		log.info("Username entered");
		email.sendKeys("inna.stici@gmail.com");
		log.info("Email entered");
		selectFileBtn.sendKeys("D:\\img\\test-picture.jpg");
		log.info("Profile picture is uploaded");
		password.sendKeys("Lenovovibes1");
		log.info("Password entered");
		confirmPassword.sendKeys("Lenovovibes1");
		log.info("Password confirmed");
		submitBtn.click();
		log.info("Registration form is submitted");

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<String>() {
			public String apply(WebDriver d) {
				return d.getTitle();
			}
		});
		System.out.println("Page title is: " + driver.getTitle());
		log.info("Registered successfully!");
		screen(driver);

		Thread.sleep(1000);
		driver.quit();
	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\log\\" + this.getClass().getSimpleName() + ".png"));
	}
}
