package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("987654321");
		WebElement password = driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("test");
		WebElement viewpassword = driver.findElement(By.xpath("//DIV[@class='_9ls7']/A/DIV"));
		viewpassword.click();
		Thread.sleep(3000);
		driver.close();
	}
}
