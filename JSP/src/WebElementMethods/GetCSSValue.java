package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver .manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement email = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(email.getCssValue("color"));
		System.out.println(email.getCssValue("fontsize"));
		System.out.println(email.getCssValue("backgroundcolor"));
	}

}
