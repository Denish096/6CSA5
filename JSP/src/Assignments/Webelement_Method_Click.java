package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Method_Click {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.xpath("//*[@name='username']\r\n"));
	username.click();
	WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
	password.click();
	Thread.sleep(3000);
	driver.close();
}
}
