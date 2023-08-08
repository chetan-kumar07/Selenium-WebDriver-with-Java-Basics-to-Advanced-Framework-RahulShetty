package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//for-rows 
		List<WebElement> values=driver.findElements(By.cssSelector(".table-display tr"));
		int rows=0;
		for(int i=0;i<values.size();i++) {
			rows+=1;
		}
		System.out.println("Number of rows: "+rows);
		//for-columns
		List<WebElement> myValues=driver.findElements(By.cssSelector(".table-display th"));
		int columns=0;
		for(int i=0;i<myValues.size();i++) {
			columns+=1;
		}
		System.out.println("Number of columns: "+columns);
		
		System.out.println("Instructor: "+driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(1)")).getText());
		System.out.println("Course: "+driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(2)")).getText());
		System.out.println("Price: "+driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(3)")).getText());
	}

}
