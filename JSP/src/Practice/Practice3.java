package Practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ww.fb.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.manage().window().fullscreen();
		Set<Cookie> allcookies = driver.manage().getCookies();
		System.out.println(allcookies.size());
		for (Cookie cookie : allcookies) {
			cookie.getName();
		}
		Cookie cookie1 = new Cookie("Denish","123");
		driver.manage().addCookie(cookie1);
	 	allcookies = driver.manage().getCookies();
	 	System.out.println(allcookies.size());
	 	for (Cookie cookie : allcookies) {
	 		System.out.println(cookie.getName());
		}
	 	driver.manage().deleteCookieNamed("Denish");
	 	allcookies=driver.manage().getCookies();
	 	System.out.println(allcookies.size());
	 	for (Cookie cookie : allcookies) {
	 		System.out.println(cookie.getName());
		}
	 	driver.manage().deleteAllCookies();
	 	allcookies = driver .manage().getCookies();
	 	System.out.println(allcookies.size());
}
}