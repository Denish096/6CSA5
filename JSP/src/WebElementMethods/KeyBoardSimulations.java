package WebElementMethods;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardSimulations{
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		WebElement username=driver.switchTo().activeElement();
		// username element find
		username.clear();
		// Append the input in active element " username "
		username.sendKeys("Selenium");
		// Send your control to password by using tab BTN and append the input in password text field
		username.sendKeys(Keys.TAB + "password");
		// Send  your control to loginBTN by using tab BTN 2Times ; 
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB);
		// click on login BTN using ENTER BTN"
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
}
