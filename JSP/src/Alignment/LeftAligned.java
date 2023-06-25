package Alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAligned {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passContainer"));
		int emailX = username.getRect().x;
		int passX = password.getRect().x;
		if (emailX == passX)
			System.out.println("elements are left alinged");
		else
			System.out.println("elements are not left aligned");
		System.out.println(emailX);
		System.out.println(passX);
		driver.close();
	}

}
