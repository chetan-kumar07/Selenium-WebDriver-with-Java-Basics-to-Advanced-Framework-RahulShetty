package Section13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();	
		driver.manage().window().maximize();		// for maximizing the window
		driver.manage().deleteAllCookies();			// use for delete all cookies
		driver.manage().deleteCookieNamed("sessionKey");	// to delete the specific key 
		driver.get("https://www.google.com/");
		
		// for taking the screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Selenium Screenshot//screenshot_2.png"));
	}

}
