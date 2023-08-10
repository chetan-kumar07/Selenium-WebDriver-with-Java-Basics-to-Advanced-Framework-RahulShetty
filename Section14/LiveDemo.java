package Section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	// Performing webTable sorting using Java Selenium
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//click on column
		driver.findElement(By.xpath("//tr//th[1]")).click();
		
		// capture all webelements into list
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr//td[1]"));
	
		// capture text of all webelements  using (.getText()) into new List 
		List<String> originalList= elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
	
		// sort inthe list step3 -> sorted list
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		
		// compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		// scan the name column with getText -> Rice -> print the price of the Rice
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr//td[1]")); 
		price=rows.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		// In lambda expression left side argument is the item present in the list and in right side what actions we have to perform  
		price.forEach(a->System.out.println(a));
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}
		while (price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}	

}
