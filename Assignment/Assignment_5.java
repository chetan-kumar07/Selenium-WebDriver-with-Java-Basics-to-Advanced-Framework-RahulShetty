package Assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",	"C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
	
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		String result=driver.findElement(By.id("content")).getText();
		System.out.println(result);
		
		
		
	}

}
