package AlertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaAlertsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		
		//Switch the driver to alerts. And then accept the alert. 
//		driver.switchTo().alert().accept(); //positive scenarios- OK/Done/Accept. 
		
		//Switch the driver to alerts. And then get the text in the alert
		System.out.println(driver.switchTo().alert().getText());
				
		
		//Switch the driver to alerts. And then decline the alert. 
		driver.switchTo().alert().dismiss(); //negative scenarios- No/decline/cancel 
		
		//Switch the driver to alerts. And then enter the text into the alert 
		driver.switchTo().alert().sendKeys("test input into the alert");
				
		
	}

}
