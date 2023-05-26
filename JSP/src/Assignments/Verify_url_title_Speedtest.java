package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_title_Speedtest {
	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.speedtest.net/");
			String ActualURL = driver.getCurrentUrl();
			String ExpectedURL ="https://www.speedtest.net/";
			if(ActualURL.equals(ExpectedURL))
				System.out.println("URL Test is Pass");
			else
				System.out.println("URL Test is Fail");
			String ActualTitle=driver.getTitle();
			String ExpectedTitle="Speedtest by Ookla - The Global Broadband Speed Test";
			if(ActualTitle.equals(ExpectedTitle))
				System.out.println("Title  Test is Pass");
			else
				System.out.println("Title  Test is Fail");
			driver.close();
	}


}
