package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAppilcation {

	public static void main(String[] args) {
		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// to load URL
		driver.get("https://login.salesforce.com/");
		// To maximize window
		driver.manage().window().maximize();
		// Thread.sleep(1000);
		//to locate the element
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		// Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		// Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		//to verify the title
		String title = driver.getTitle();
		System.out.println(title);

	}

}
