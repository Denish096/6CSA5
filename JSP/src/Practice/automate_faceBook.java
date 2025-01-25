package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automate_faceBook {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		URL URL = new URL("https://www.facebook.com/");
//		signupBTN = driver.findElement(by.)
		driver.navigate().to(URL);
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("8690643143");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("Zac@6345");
		Thread.sleep(2000);
		WebElement LoginBTN = driver.findElement(By.name("login"));
		System.out.println(LoginBTN.getCssValue("font-size"));
		System.out.println(LoginBTN.getCssValue("width"));
		System.out.println(LoginBTN.getCssValue("border-radius"));
		System.out.println(LoginBTN.getCssValue("line-height"));
//		LoginBTN.click();
		driver.close();
	}
}
