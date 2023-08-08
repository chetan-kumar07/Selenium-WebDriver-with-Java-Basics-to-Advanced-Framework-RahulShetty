package Section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Chetan Kumar\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();	
			
			
//			 To track the broken link -->
//			 Inspect the website then click on Element option and check the status if status code is more than 400. 
//			 It means that given link is broken link.
			
//			 Java methods will call URL and gets the status code.
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
			//	When an assertion fails, don't throw an exception but record the failure.
			//	Calling assertAll() will cause an exception to be thrown if at least one assertion failed.

			SoftAssert a=new SoftAssert();
			
			for(WebElement link:links) {
				String url=	 link.getAttribute("href");
				
				HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();	//Opens a communications link to the resource referenced by this URL, if such a connection has not already been established. 
				int respCode=conn.getResponseCode();
				System.out.println(respCode);
				a.assertTrue(respCode<400,"The link with text "+link.getText()+"is broken with code "+respCode );	// condition, message 
				
			}
			a.assertAll();		// if we dont't write here then it will caught all failures but not report so we have to right it. 
			// assertAll throw an exception at the last stage when all execution of program is done.
		}
}
