import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe"); //(Key -> Value)
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Chetan Kumar");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); // 1000 milliSeconds is equivalent to 1 second.
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Chetan Kumar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("info@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("info@chetan.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("info@chetan.com");	// css with index value {last preference}
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9898989999");		//	parentTagname/childTagname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(1000); 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Chetan Kumar");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");	//Regular Expression for css
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();		//Regular Expression for xpath
		
//		Thread.sleep(4000);
//		driver.findElement(By.className("logout-btn")).click();
	}

}
