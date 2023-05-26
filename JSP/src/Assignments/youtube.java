package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
