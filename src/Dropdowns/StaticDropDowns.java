package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
//		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));

		s.selectByValue("AED"); // Identifies by value
		Thread.sleep(2000);
		s.selectByIndex(2); // By Index. Counting of index starts from 0
		Thread.sleep(2000);
		s.selectByVisibleText("USD"); // USing the visible text. 

	}

}
