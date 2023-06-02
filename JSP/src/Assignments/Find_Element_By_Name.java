package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element_By_Name {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.name("viewport"));
		System.out.println("element 1 identified");
		
		driver.get("https://www.speedtest.net");
		driver.findElement(By.name("description"));
		System.out.println("element 2 identified");
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("google"));
		System.out.println("element 3 identified");
		
		driver.get("https://www.nseindia.com/");
		driver.findElement(By.name("viewport"));
		System.out.println("element 4 identified");
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("og_site_name"));
		System.out.println("element 5 identified");
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("robots"));
		System.out.println("element 6 identified");
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("format-detection"));
		System.out.println("element 7 identified");
		
		driver.get("https://www.thejaipurdialogues.com/");
		driver.findElement(By.name("viewport"));
		System.out.println("element 8 identified");
		
		driver.get("https://www.fb.com");
		driver.findElement(By.name("description"));
		System.out.println("element 9 identified");
		
		driver.get("https://zerodha.com/");
		driver.findElement(By.name("description"));
		System.out.println("element 10 identified");
		
		driver.close();
	}

}
