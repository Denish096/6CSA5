package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demowebshop.tricentis.com/");
		String title= driver.getTitle();
		System.out.println(title);
		
	}

}
