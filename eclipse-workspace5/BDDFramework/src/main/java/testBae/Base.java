package testBae;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	
	public Base() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\lakmi\\eclipse-workspace5\\BDDFramework\\src\\main\\java\\properties\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) { //not going to pause th eexecution 
				
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {  //not going to pause the execution
			
			e.printStackTrace();
		}
		
	}
	public static void initialization() {
		String browser_name= prop.getProperty("browser");
				
				if(browser_name.equals("Chrome")) {
				   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakmi\\OneDrive\\Desktop\\drivers\\chromedriver.exe");
				   driver = new ChromeDriver();
				}
				
								   
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}


