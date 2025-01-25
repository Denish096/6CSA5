package CloseAndQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Close1 {
	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.fb.com");
		driver.close();
	}
}
