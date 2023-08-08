import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

// Testng is a testing framework
public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		// Assertion is used for validate the results which is being returning by selenium with your expected results
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());		// Asserts that a condition is false. If it isn't, an AssertionError is thrown.
		// assertfalse method will only expect false value	
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());		// * star lagane par jitne bhi SeniorCitizenDiscount hoge sabhi include ho jayenge	
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());		
		
		System.out.println("-----------------------------------------------"); 
		
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			 System.out.println("Its enabled");
			 Assert.assertTrue(true);
		 }
		 else {
			 Assert.assertTrue(false);
		 }
		
		
		
		
		
		
		// Count the number of checkboxes
		int count=driver.findElements(By.cssSelector("input[type='checkbox']")).size();  // if more than one elements then we use (driver.findElements) and size is used to returns the number in the list. 
		System.out.println(count);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L); 	// 2000L it is same considered as Long.
		
//		int i=1;
//		while(i<5) {
//		driver.findElement(By.id("hrefIncAdt")).click();		// 4 times
//		i++;
//		}
		
		
		System.out.println("Before Selecting: "+driver.findElement(By.id("divpaxinfo")).getText()); // before
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	// click on the same button with for loop
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");			// Asserts that two Strings are equal. If they are not, an AssertionError is thrown.
		System.out.println("After Selecting: "+driver.findElement(By.id("divpaxinfo")).getText());	// after
	}

}
