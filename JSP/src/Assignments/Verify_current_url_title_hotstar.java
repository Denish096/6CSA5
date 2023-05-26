package Assignments;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_current_url_title_hotstar {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com");
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL ="https://www.hotstar.com";
		if(ActualURL.equals(ExpectedURL))
			System.out.println("URL Test is Pass");
		else
			System.out.println("URL Test is Fail");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket & Football";
		if(ActualTitle.equals(ExpectedTitle))
			System.out.println("Title  Test is Pass");
		else
			System.out.println("Title  Test is Fail");
		driver.close();
	}
	

}
