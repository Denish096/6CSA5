package WebElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys4 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.switchTo().activeElement().sendKeys("987654312");
}
}
