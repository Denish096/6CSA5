package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_un_pwd_orangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		if (username.isDisplayed() && username.isEnabled())
			username.sendKeys("Admin");
		else
			System.out.println("username element is not present");
		if (password.isDisplayed() && password.isEnabled())
			password.sendKeys("admin123");
		else
			System.out.println("password element is not present");
		if (loginBTN.isDisplayed() && loginBTN.isEnabled())
			loginBTN.click();
		else
			System.out.println("loginBTN element is not present");

	}

}
