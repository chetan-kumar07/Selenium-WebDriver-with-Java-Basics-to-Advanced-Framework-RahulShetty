package Assignment;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String text=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(text);
		WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText(text);	
		driver.findElement(By.cssSelector("#name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		if(alertText.contains(text)) {
			System.out.println("Processed");
		}
		else {
			System.out.println("Not Processed");
		}
	}

}
