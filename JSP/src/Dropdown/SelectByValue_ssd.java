package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue_ssd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/denis/Desktop/dropdown_test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement country = driver.findElement(By.id("country"));
		Select select = new Select(country);
		Thread.sleep(2000);
		select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByValue("4");
	}

}
