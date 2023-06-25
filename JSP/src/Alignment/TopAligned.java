package Alignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAligned {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("passContainer"));
		int userY = user.getRect().y;
	    int passY = pass.getRect().y;
	    int userH = user.getRect().height;
	    if(passY>userH+userY)
	    	System.out.println("elements are Top Aligned");
	    else
	    	System.out.println("elements are not top Aligned");
	    driver.close();
	}

}
