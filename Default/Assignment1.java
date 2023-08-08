import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**********************************************************************************
Hi All
Assignment for Selenium:
Please perform the following:
Launch the Chrome.
Open URL - http://www.google.com
Enter the keyword "selenium tutorial" in the search bar
Get/store all the search results in a list
Print all the suggestions one by one.
Click on any of the suggestions using the click() command and get the page title.
**********************************************************************************/

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();									// Maximize the window
		driver.get("https://www.google.com"); 									// load a new page
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Tutorial");		// type "Selenium Tutoral" in search-box
		Thread.sleep(2000);														//  suspends the current thread for a specified time in milliseconds 
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);				//  pressing the ENTER key
		Thread.sleep(5000);
		System.out.println("***** All Search Results *****");
		System.out.println("-------------------------------\n");
		List<WebElement> list=driver.findElements(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md"));	//	list 
		
		int i = 0, k = 1; 								// Index and counter initialization
		while (i < list.size()) {
		    WebElement ans = list.get(i); 				// Get current WebElement
		    String result = ans.getText().trim(); 		// Trim the text
		    if (!result.isEmpty()) {
		        System.out.println(k + ". " + result); 	// Print with counter
		        k++; 									//	Increment counter
		    }
		    i++; 										// Move to the next index
		}
		
		list.get(2).click();													// choose search suggestion (indexing start from 0)
		System.out.println("\nTitle of Page : "+driver.getTitle());				// Get the title of the current page                                             
		driver.quit();												
	}
}
