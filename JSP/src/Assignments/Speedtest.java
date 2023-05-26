package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Speedtest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.speedtest.net/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
