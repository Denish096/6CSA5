package Practice;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class Scanner_class_to_use_with_string {
	public static void main(String[] args) {

		WebDriver driver = null;
		WebDriver driver1 = null;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Browser name to open");
		String s=sc.next();
		System.out.println("enter url to open");
		String url = sc.next();
		System.out.println("enter 2nd Browser to open");
		String e=sc.next();
		System.out.println("enter url to open");
		String url2=sc.next();

		if(s.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome is opening..");
			driver = new ChromeDriver();}
		else if (s.equalsIgnoreCase("edge")) {
			System.out.println("edge is opening..");
			driver =new ChromeDriver();}
		else if (s.equalsIgnoreCase("firefox")) {
			System.out.println("Fire fox is opening..");
			driver = new FirefoxDriver();}
		else if (s.equalsIgnoreCase("safari")) {
			System.out.println("safari is opening..");
			driver = new SafariDriver();}
		else {
			System.out.println("There is no browser like --->"+ s);
			return;}
		Dimension d = new Dimension(750, 800);
		driver.manage().window().setSize(d );	
		Point p = new Point(700, 0);
		driver.manage().window().setPosition(p );
//		driver.manage().window().minimize();
		driver.get(url);
		if(e.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome is opening..");
			driver1 = new EdgeDriver();}
		else if (e.equalsIgnoreCase("edge")) {
			System.out.println("edge is opening..");
			driver1 =new EdgeDriver();}
		else 
			return;
		
		Dimension g = new Dimension(800, 800);
		driver1.manage().window().setSize(g );
		driver1.get(url2);
		
	}
}
