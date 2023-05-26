package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_title_tradingview {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.tradingview.com/");
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL ="https://in.tradingview.com/";
		if(ActualURL.equals(ExpectedURL))
			System.out.println("URL Test is Pass");
		else
			System.out.println("URL Test is Fail");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="TradingView – Track All Markets";
		if(ActualTitle.equals(ExpectedTitle))
			System.out.println("Title  Test is Pass");
		else
			System.out.println("Title  Test is Fail");
		driver.close();
		
	}

}
