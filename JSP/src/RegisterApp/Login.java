package RegisterApp;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		Random random = new Random() ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("abcd");
		driver.findElement(By.id("LastName")).sendKeys("patel");
		driver.findElement(By.id("Email")).sendKeys("asdghag@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("22332233");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("22332233");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		
		

}

}
