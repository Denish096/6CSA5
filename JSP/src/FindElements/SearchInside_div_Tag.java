package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInside_div_Tag {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com");
		WebElement parentElement = driver.findElement(By.className("desktop-navLinks"));
		List<WebElement> Allmenus=parentElement.findElements(By.className("desktop-navContent"));
		for (WebElement menu : Allmenus) {
			System.out.println(menu.getText());
		}
		driver.quit();
	}
}
