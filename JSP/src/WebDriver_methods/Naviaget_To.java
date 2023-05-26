package WebDriver_methods;




import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naviaget_To {
	public static void main(String[] args) throws MalformedURLException { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		URL url = new URL ("https://www.instagram.com");
		driver.navigate().to(url);
	}

}
