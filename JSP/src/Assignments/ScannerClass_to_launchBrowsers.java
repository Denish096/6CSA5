package Assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScannerClass_to_launchBrowsers {
	public static void main(String[] args) {
		System.out.println("Enter 1 for launching Chrome Browser ");
		System.out.println("Enter 2 for launching Edge Driver");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("Chrome driver is launching");
			WebDriver driver = new ChromeDriver();
			driver.get("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e1/Google_Chrome_icon_%28February_2022%29.svg/1200px-Google_Chrome_icon_%28February_2022%29.svg.png");
		} else if (a == 2) {
			System.out.println("Edge driver is launching");
			WebDriver driver1 = new EdgeDriver();
			driver1.get("https://upload.wikimedia.org/wikipedia/commons/7/7e/Microsoft_Edge_logo_%282019%29.png");
		} else
			return;
	}
}
