package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_automate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.findElement(By.name("search_query")).sendKeys("ram sia ram by sachet tandon");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='chip-bar']/../../..//a[@id='video-title'][1]")).click();
	}
}
