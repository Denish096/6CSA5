package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.instagram.com");
		driver.navigate().to("https://www.tradingview.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);// it is used to slow down action ,so we can see the execution.
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

}
