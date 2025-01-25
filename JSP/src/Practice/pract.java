package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.fb.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Denish");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patel");
		driver.findElement(null)
		
	}
}
