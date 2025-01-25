package WebDriver_methods;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deal_with_wid_and_windows {
	public static void main(String[] args) throws Throwable  { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		// get facebook id
		String facebookID = driver.getWindowHandle();
		System.out.println(" FaceBookID - " + facebookID);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.instagram.com");
		String InstaId = driver.getWindowHandle();
		System.out.println("InstaId - "+ InstaId);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com");
		String GoogleID = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		System.out.println(AllWindowId);
		System.out.println(AllWindowId.size());
		for (String Wid : AllWindowId) {
			System.out.println(Wid);
		}
		driver.switchTo().window(GoogleID);
		driver.switchTo().activeElement().sendKeys("landscape");
		Thread.sleep(4000);
		driver.switchTo().window(InstaId).close();
		driver.switchTo().window(facebookID).close();
		driver.switchTo().window(GoogleID).close();
	}
}