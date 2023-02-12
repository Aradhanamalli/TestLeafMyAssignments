package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		EdgeDriver edgedriver1 =new EdgeDriver();
		edgedriver1.get("https://www.facebook.com/");

	}

}
