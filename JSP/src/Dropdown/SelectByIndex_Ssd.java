package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex_Ssd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/denis/Desktop/dropdown_test.html");
		WebElement Country = driver.findElement(By.id("Country"));
		Select select = new Select(Country);
		Thread.sleep(4000);
		select.selectByIndex(3);
		Thread.sleep(4000);
		select.selectByIndex(2);
		
		
	}

}
