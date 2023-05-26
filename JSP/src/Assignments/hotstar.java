package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotstar {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver () ;
	driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
