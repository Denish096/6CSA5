package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Set_positions_for_chrome_n_edge {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriver driver1 = new EdgeDriver ();
//	Thread.sleep(2000);
	Dimension d = new Dimension(759, 814);
	driver.manage().window().setSize(d);
	Point p= new Point(752, 0);
	driver.manage().window().setPosition(p);
//	driver.get("https://www.youtube.com/watch?v=-_MGg2cjlGA&t=3408s");
	Dimension e = new Dimension(759, 814);
	driver1.manage().window().setSize(e);
	Point q = new Point(0, 0);
	driver1.manage().window().setPosition(q);
//	driver1.get("https://i1.sndcdn.com/artworks-Lgdaig9D73SzDpv3-RvGJJQ-t500x500.jpg");
	driver.close();
	driver1.close();
	}
}
