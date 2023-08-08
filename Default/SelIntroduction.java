import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser
		// Chrome - ChromeDriver -> Methods   (It has class called ChromeDriver which gave us the method to Automate.
		// Firefox - FirefoxDriver -> Methods
		// Safari - SafariDriver -> Methods (All methods are same in All Browser)
	
		//WebDriver is an Interface  
		
		//chromedriver.exe (Heart) --> Chrome Browser	
		//webdriver.chrome.driver --> value of path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");	//Load a new web page in the current browser window.
		
		System.out.println(driver.getTitle());			//Get the title of the current page.
		System.out.println(driver.getCurrentUrl()); 	//Get a string representing the current URL that the browser is looking at. 

		driver.quit();		//Close the current window, quitting the browser.

		
		
	}

}
