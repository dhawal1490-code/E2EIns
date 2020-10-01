package Instagram.E2EIns;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriverWait wait;	

	public WebDriver initializeDriver() throws IOException{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Automation1\\E2EIns\\src\\main\\java\\resources\\data.properties");
	
		prop.load(fis);
		String browserName =prop.getProperty("browser");
	
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\CrDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("mozila")) {
			System.setProperty("webDriver.gecko.driver","D:\\SeleniumDrivers\\MDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void takeScreenshot(){
		//File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
}
