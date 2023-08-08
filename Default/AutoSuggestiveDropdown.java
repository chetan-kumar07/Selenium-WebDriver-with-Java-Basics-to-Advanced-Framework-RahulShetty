import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe"); //(Key -> Value)
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().window().maximize();
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(3000); 		// wait for 3 seconds so that option can load
	List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("India")) {
			option.click();
			break;
			}
		}
	System.out.println("Executed");
	}
}
