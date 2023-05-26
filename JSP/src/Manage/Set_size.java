package Manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Dimension value = new Dimension(250, 250);
		driver.manage().window().setSize(value);
		System.out.println(driver.manage().window().getSize());
		Point value1 = new Point(200,200);
		driver.manage().window().setPosition(value1);
		System.out.println(driver.manage().window().getSize());
	}
}
