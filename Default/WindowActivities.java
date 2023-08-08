import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe"); //(Key -> Value)
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		Thread.sleep(3000);
		driver.navigate().back();		// Move back a single "item" in the browser's history.
		Thread.sleep(3000);  
		driver.navigate().forward();	// move a single "item" forward in the browser's history. Does nothing if we are on the latest page viewed.
	}
}
