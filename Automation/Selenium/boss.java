package seleniumPractice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class boss {

	protected WebDriver driver;
	protected Logger log = Logger.getLogger("boss");

	@BeforeMethod
	public void before() {

		driver = new ChromeDriver();
		// Reporter.log("--==Select Browser==--", true);
		// Scanner input = new Scanner(System.in);
		// String select = input.nextLine();
		// if (select.equals("CC")) {
		// driver = new ChromeDriver();
		// System.out.println("Has bee selectd browser: " +
		// driver.getClass().getSimpleName());
		// }
		// if (select.equals("FF")) {
		// driver = new FirefoxDriver();
		// System.out.println("Has bee selectd browser: " +
		// driver.getClass().getSimpleName());
		// }

		log.info("Browser is opening");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void after() throws Exception {
		screens();
		driver.quit();
	}

	public void screens() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\Java\\!Automation\\Logs\\Screens\\" + this.getClass().getSimpleName()
				+ " " + driver.getClass().getSimpleName() + " " + time() + ".png"));
	}

	public String time() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
