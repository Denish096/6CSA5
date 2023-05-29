package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieNamed {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tradingview.com");
	Set<Cookie> allcooky = driver.manage().getCookies();
	for (Cookie cookie : allcooky) {
	System.out.println(cookie.getName());}
	Cookie cooky = driver.manage().getCookieNamed("_ga");
	System.out.println(cooky);
}
}
