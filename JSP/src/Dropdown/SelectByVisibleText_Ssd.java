package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText_Ssd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/denis/Desktop/dropdown_test.html");
		WebElement beverage = driver.findElement(By.id("beverage"));
		Select select = new Select(beverage);
		Thread.sleep(2000);
		select.selectByVisibleText("Coffee");
		Thread.sleep(2000);
		select.selectByVisibleText("Whiskey");
		
		
	}

}
