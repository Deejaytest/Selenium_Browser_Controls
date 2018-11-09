package AlertsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalAlerts_withHTML {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//label[text()='Multicity']")).click();
		
		//Get the text of the alertbox. Alertbox has some html code here
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Multicity booking does not mean connecting flight.')]")).getText());
		
		//Click on the OK button of the alert. 
		driver.findElement(By.id("MultiCityModelAlert")).click();

	}

}
