package FindElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithForm {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.fb.com");
		// identify the <form> by using form tag  
		WebElement parentElement = driver.findElement(By.tagName("form"));
		WebElement usernameTF = parentElement.findElement(By.id("email"));
		WebElement passwordTF = parentElement.findElement(By.id("pass"));
		WebElement LoginBTN = parentElement.findElement(By.name("login"));
		usernameTF.sendKeys("hello there");
		passwordTF.sendKeys("87623754");
		LoginBTN.click();
//		Thread.sleep(2000);
//		driver.close();
	}

}
