package Assignments;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie_Practice1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Set<Cookie>  allCookies= driver.manage().getCookies();
		System.out.println(allCookies.size());
		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName());}
		Cookie cooky1 = new Cookie("selenium", "123");
		Cookie cooky2 = new Cookie("java", "234");
		Cookie cooky3 = new Cookie("manual" , "567");
		driver.manage().addCookie(cooky1);
		driver.manage().addCookie(cooky2);
		driver.manage().addCookie(cooky3);
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName());}
		System.out.println(allCookies.size());
		driver.manage().deleteCookieNamed("selenium");
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName());}
		System.out.println(allCookies.size());
		driver.manage().deleteCookie(cooky3);
		allCookies = driver.manage().getCookies();
		for (Cookie cookie : allCookies) 
			System.out.println(cookie.getName());
		driver.manage().deleteAllCookies();
		allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
	}
}
