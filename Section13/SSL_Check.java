package Section13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Check {
// handle the website where it isn't secure
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ChromeOptions class helps us to set the behavior of chrome browser
		ChromeOptions options=new ChromeOptions();
		Proxy proxy=new Proxy();			// proxy class object 
		proxy.setHttpProxy("ipaddress:4444");	
		options.setCapability("proxy",proxy);	// capabilities are options that can customize and configure a chromedriver session. 
		options.setAcceptInsecureCerts(true);	// tell to chrome when invalid certification comes accept them.
		// block pop-up windows 
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chetan Kumar\\chromedriver.exe"); //(Key -> Value)
		WebDriver driver =new ChromeDriver(options); 		// pass the argument(options) to chromedriver
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
