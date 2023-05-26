package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://www.netflix.com/browse");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
