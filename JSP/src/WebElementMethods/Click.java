package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		WebElement passcontainer = driver.findElement(By.id("passContainer"));
		Thread.sleep(2000);
		passcontainer.click();
		driver.close();
	}

}
