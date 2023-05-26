package Manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
	}

}
