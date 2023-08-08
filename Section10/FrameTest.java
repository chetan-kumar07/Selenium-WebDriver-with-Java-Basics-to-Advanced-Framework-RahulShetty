package Section10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//		driver.findElement(By.id("draggable")).click();		//frames are the specific container which are hosted on the web pages
		Actions a =new Actions(driver);
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		
		// Email -> mentor@rahulshettyacademy.com 
	}

}
