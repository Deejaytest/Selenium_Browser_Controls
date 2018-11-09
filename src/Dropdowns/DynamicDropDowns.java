package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // locate and click the dynamic dropdown
		driver.findElement(By.xpath("//a[@value='JAI']")).click();  // click item of first dynamic dropdown
		driver.findElement(By.xpath("(//a[@value='IXE'])[2]")).click(); //Click item on second dynmaic dropdown which is the replica of first one.
		

	}

}
