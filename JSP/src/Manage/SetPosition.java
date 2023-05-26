package Manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getPosition());
				Point value=new Point(100,6);
				driver.manage().window().setPosition(value);
				System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);

	}

}
