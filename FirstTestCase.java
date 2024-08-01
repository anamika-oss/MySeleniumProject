package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

/*
 * Test Case
 * Launch browser
 * Open URL
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Lanuch web browser (chrome)
		
		// ChromeDriver driver=new ChromeDriver();   // create an object 
		
		//WebDriver driver = new ChromeDriver();  // we can store any browser like edge, firefox
		WebDriver driver = new EdgeDriver();
	
		
		// 2) Open URL
		
		driver.get("https://staging-drive.hubbleconnected.com/");
		
		// 3) validate title <title>Hubble Cloud Storage</title>
		
		
		String act_title= driver.getTitle();
		
		if (act_title.equals("Hubble Cloud Storage"))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
	
	//close browser
	
	//driver.close();
	//driver.quit();
	}
}
