package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie> allCookie = driver.manage().getCookies();
		System.out.println(allCookie.size());
		for (Cookie cookie : allCookie) {
			System.out.println(cookie.getName());
		}
		Cookie cooky = new Cookie("selenium", "123");
		driver.manage().addCookie(cooky);
		Set<Cookie> allcookie1 = driver.manage().getCookies();
		System.out.println(allcookie1.size());
		for (Cookie cookie2 : allcookie1) {
			System.out.println(cookie2.getName());
		}
		driver.manage().deleteCookie(cooky);
		Set<Cookie> allcookie2 = driver.manage().getCookies();
		System.out.println(allcookie2.size());
		for (Cookie cookie2 : allcookie2) {
			System.out.println(cookie2.getName());
		}
	}

}
