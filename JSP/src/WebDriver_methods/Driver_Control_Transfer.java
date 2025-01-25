package WebDriver_methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Control_Transfer {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.instagram.com");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");
		Set<String> allWindowid = driver.getWindowHandles();
		for (String Windowid : allWindowid) {
			String windowURL = driver.switchTo().window(Windowid).getCurrentUrl();
			if(windowURL.equals("https://www.facebook.com")) {
				driver.findElement(By.name("login")).click();
			}
			else if (windowURL.equals("https://www.instagram.com")) {
				driver.close();
			}
			else if(windowURL.equals("https://www.google.com")) {
				driver.manage().window().minimize();
			}
		}
		
	}

}
