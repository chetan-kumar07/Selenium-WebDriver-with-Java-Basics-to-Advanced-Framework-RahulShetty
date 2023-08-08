import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment1_CheckboxExercises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//Question-1
		//	driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();	
		
		//Question-2 
		int size=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("Total Checkboxes : "+size);
		driver.quit();
		}
}
