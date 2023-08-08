import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2_RahulShetty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Chetan Kumar");
		driver.findElement(By.name("email")).sendKeys("Chetan@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement staticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticDropdown);
		//	dropdown.selectByIndex(0);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("03/29/2003");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
	}

}
