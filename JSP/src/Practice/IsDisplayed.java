package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsDisplayed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		boolean b = false;
		if(driver.findElement(By.xpath("//input[@value='-1']")).isSelected()== true)  {
			b = driver.findElement(By.name("preferred_pronoun")).isDisplayed();
		}
		if(b==true)
			System.out.println(b + " its visible" );
		else
			System.out.println(b + " its not visible");
	}
}