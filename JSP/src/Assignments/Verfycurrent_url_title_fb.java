package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verfycurrent_url_title_fb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.fb.com");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		if(actualURL.equals(expectedURL))
			System.out.println("URL Test Pass");
		else
			System.out.println("URL Test Fail");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle))
			System.out.println("Title Test Pass");
		else
			System.out.println("Title Test Fail");
		driver.close();
	}

}
