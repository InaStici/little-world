package seleniumPractice;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParkCalcWithDataProvider {

	@Test(dataProvider = "parkingCalculation")
	public void test(String lot, String time1, String date1, String time2, String date2, String totalCost)
			throws Exception {
		Logger log = Logger.getLogger("WPlogin");
		PropertyConfigurator.configure(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\seleniumPractice\\log4j.properties");
		BasicConfigurator.configure();
		WebDriver driver = new ChromeDriver();
		Scanner in = new Scanner(System.in);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://adam.goucher.ca/parkcalc/index.php");
		log.info("DemoQA registration form");

		Select lots = new Select(driver.findElement(By.xpath("//select[@id='Lot']")));
		Map<String, String> lot1 = new HashMap<String, String>();
		lot1.put("lot1", "Short-Term Parking");
		lot1.put("lot2", "Economy Parking");
		lot1.put("lot3", "Long-Term Surface Parking");
		lot1.put("lot4", "Long-Term Garage Parking");
		lot1.put("lot5", "Valet Parking");

		WebElement am1 = driver.findElement(By.xpath("//tbody//tr[2]//td[2]//font[1]//input[2]"));
		WebElement am2 = driver.findElement(By.xpath("//tbody//tr[3]//td[2]//font[1]//input[2]"));
		WebElement entryTime = driver.findElement(By.xpath("//input[@id='EntryTime']"));
		WebElement entryDate = driver.findElement(By.xpath("//input[@id='EntryDate']"));
		WebElement leavingTime = driver.findElement(By.xpath("//input[@id='ExitTime']"));
		WebElement leavingDate = driver.findElement(By.xpath("//input[@id='ExitDate']"));
		WebElement cost = driver.findElement(By.xpath("//b[contains(text(),'$ ')]"));
		WebElement calculateBtn = driver.findElement(By.xpath("//input[@value='Calculate']"));

		// select lot
		lots.selectByVisibleText(lot1.get(lot));
		log.info("Lot selected");

		// enter entry time
		entryTime.clear();
		entryTime.sendKeys(time1);
		am1.click();
		log.info("Entry time entered");

		// enter entry date
		entryDate.clear();
		entryDate.sendKeys(date1);
		log.info("Entry date entered");

		// enter leaving time
		leavingTime.clear();
		leavingTime.sendKeys(time2);
		am2.click();
		log.info("Leaving time entered");

		// enter leaving date
		leavingDate.clear();
		leavingDate.sendKeys(date2);
		log.info("Leaving date entered");

		// calculate parking cost
		calculateBtn.click();
		Thread.sleep(2000);
		cost = driver.findElement(By.xpath("//b[contains(text(),'$ ')]"));
		log.info("Total parking cost: " + cost.getText());

		Assert.assertEquals(cost.getText(), totalCost);
		screen(driver);
		Thread.sleep(1000);
		driver.close();
	}

	@DataProvider(name = "parkingCalculation")
	public Object[][] provideData1() {

		return new Object[][] { { "lot1", "11:00", "08/14/2018", "21:00", "08/16/2018", "$ 72.00" },
				{ "lot2", "18:00", "08/15/2018", "21:30", "08/16/2018", "$ 25.00" },
				{ "lot3", "11:40", "08/11/2018", "23:00", "08/18/2018", "$ 70.00" },
				{ "lot4", "09:00", "08/12/2018", "21:30", "08/20/2018", "$ 96.00" },
				{ "lot5", "12:00", "08/15/2018", "17:30", "08/17/2018", "$ 90.00" } };

	}

	public void screen(WebDriver d) throws Exception {

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(
				"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\log\\" + this.getClass().getSimpleName() + ".png"));
	}
}
