package Instagram.E2EIns;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;

public class InstaTest4 extends base{
	@BeforeClass()
	public void initialize(ITestContext context) throws IOException{
		System.out.println("Insta4 initialize");
		driver= initializeDriver();
		System.out.println(driver);
		context.setAttribute("driver", driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);
	}
	
	//@Test(dataProvider = "getData")
	@Test()
	public void InstaGoogleTest() throws IOException, InterruptedException{
		
		System.out.println("Insta4 Fail Test");
		System.out.println(driver);
		Assert.fail("Test Failed");
		
	}	
	
	@AfterClass()
	public void tearDown(){
		System.out.println("Insta4 tearDown");
		driver.quit();
	}

}
