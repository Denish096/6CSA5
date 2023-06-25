package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("9876543211");
	Thread.sleep(1000);
	email.clear();
	Thread.sleep(1000);
	driver.close();
	
	}
}
