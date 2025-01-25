package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCombine {
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
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("4");
		select.deselectByIndex(2);
		Thread.sleep(2000);
		select.deselectByValue("4");
		Thread.sleep(2000);
		select.deselectByVisibleText("Whiskey");
		driver.close();
	}

}
