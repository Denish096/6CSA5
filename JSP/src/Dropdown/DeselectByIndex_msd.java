package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex_msd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/denis/Desktop/dropdown_test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cities = driver.findElement(By.id("cities"));
		Select select = new Select(cities);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.deselectByIndex(2);
	}
}
