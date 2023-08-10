package Section15;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {
	
	/*
	 * Invoking Multiple Windows/Tabs from Selenium using one driver Instance
	 * Scenario:
	 * Navigate to: https://rahulshettyacademy.com/angularpractice/
	 * Fill the "Name" field with the first course name available at https://rahulshettyacademy.com
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();									
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.TAB); // To open a New Tab in same window
		//Switching Window
		driver.switchTo().newWindow(WindowType.WINDOW); // To open a New Window
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com");
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindow);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//Capture WebElement Screenshot using Selenium.
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//Get Height & Width of Web Element using Selenium.
		System.out.println(name.getRect().getDimension().getHeight());	// to get the height
		System.out.println(name.getRect().getDimension().getWidth());	//to get the width
		
	}
}
