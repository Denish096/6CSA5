package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tradingview.com");
		Set<Cookie> allcooky = driver.manage().getCookies();
		System.out.println(allcooky.size());
		for (Cookie cookie : allcooky) {
			System.out.println(cookie.getName());
//			System.out.println(cookie.getValue());
//			System.out.println(cookie.getSameSite());
//			System.out.println(cookie.getClass());
			System.out.println(cookie.getExpiry());
		}
		driver.close();

	}

}
