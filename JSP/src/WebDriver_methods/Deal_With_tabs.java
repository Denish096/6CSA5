package WebDriver_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import LaunchBrowser.ChromeBrowser;

public class Deal_With_tabs {
	public static void main(String[] args) {
		//opening browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		// to open another window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com");
		driver.close();
		// no such window exception Bcoz of your control is on another tab
		driver.close();
	}

}
