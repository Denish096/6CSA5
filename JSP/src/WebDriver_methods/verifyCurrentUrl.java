package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(actualURL.equals(expectedURL))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
