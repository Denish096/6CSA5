package FindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allradioBTN = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement singleElement : allradioBTN) {
			singleElement.click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
