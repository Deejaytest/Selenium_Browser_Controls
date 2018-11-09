package RadioButtonHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size()); //find the number of radiobuttons using size()
		int count = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click(); // Click on radio by using only text of it
		Thread.sleep(2000);
		
		//Another approach to Click on the specific radio button dynamically using the loop. 
		for(int i=0 ; i<count ; i++)
		{
			driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(2).click();
			break;
		}
		
		
		//Another approach of handling radiobuttons dynamically. Here we are not hardcoding anything. 
		for(int i=0 ; i<count ; i++)
		{
			String elementName = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			if(elementName.equals("RoundTrip"))
			{
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			}
		}
	}

}
