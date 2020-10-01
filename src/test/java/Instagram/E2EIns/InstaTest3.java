package Instagram.E2EIns;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class InstaTest3 extends base{
	@BeforeClass()
	public void initialize() throws IOException{
		System.out.println("Insta1 initialize");
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);

		LoginPage l= new LoginPage(driver,wait);
		l.emailID().sendKeys("9850213949");
		l.password().sendKeys("gunman1490");

		//l.emailID().sendKeys("dhawal.mokashi");
		//l.password().sendKeys("gunman1490");
		l.login().click();

	}
	
	//@Test(dataProvider = "getData")
	@Test()
	public void instaFailTest() throws IOException, InterruptedException{
		
		System.out.println("Insta1 Fail Test");
		System.out.println(driver);
		Assert.fail("Test Failed");
	}	
	
	@AfterClass()
	public void tearDown(){
		System.out.println("Insta1 tearDown");
		driver.quit();
	}

}
