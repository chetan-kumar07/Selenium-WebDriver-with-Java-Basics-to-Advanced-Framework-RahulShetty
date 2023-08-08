import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe"); //(Key -> Value)
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Chetan Bhagat Books");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			Thread.sleep(2000);
			
			driver.get("https://www.amazon.in/Chetan-bhagat-400-days-Bhagat/dp/9356291144/ref=sr_1_3?keywords=chetan+bhagat+books&qid=1689138456&sprefix=cheta%2Caps%2C267&sr=8-3");
			//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
			Thread.sleep(2000);
			
			driver.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\'sw-gtc\']/span/a")).click();
			Thread.sleep(2000);	
		}
}
