package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tradingview {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://in.tradingview.com/chart");
		System.out.println(driver.getTitle());
		
    	driver.quit();
	}

}
