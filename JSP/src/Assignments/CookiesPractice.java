package Assignments;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice {
	public static void main(String[] args) {
		// fetch cookies / add cookies / fetch cookies
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName());
		}
		Cookie cook = new Cookie("cooky", "fb");
		driver.manage().addCookie(cook);
		System.out.println(driver.manage().getCookieNamed("_js_datr"));
		System.out.println(cook.getName());
		System.out.println(cook.getValue());
		Set<Cookie> alcookies = driver.manage().getCookies();
		System.out.println(alcookies.size());
		System.out.println(driver.manage().getCookieNamed("cooky"));
	}
}