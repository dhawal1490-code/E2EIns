package Instagram.E2EIns;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;

public class InstaTest2 extends base{
	@BeforeClass()
	public void initialize() throws IOException{
		System.out.println("Insta2 Initialize");
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
	@Test
	public void getwordprom() throws IOException, InterruptedException{
		System.out.println("Insta2 getwordporm");
		System.out.println(driver);
		LandingPage lp= new LandingPage(driver,wait);
		lp.searchtext().sendKeys("wordporm");
		//lp.searchtext().sendKeys("thescribbledstories");
		lp.searchElementWordPorm().click();
		List<WebElement> articles = lp.getArticles();
		System.out.print(articles.size());
		articles.get(0).click();
		String imgvalue = "https://instagram.fpnq3-1.fna.fbcdn.net/v/t51.2885-19/s150x150/22638651_154564318478119_6512702289541595136_n.jpg?_nc_ht=instagram.fpnq3-1.fna.fbcdn.net&_nc_ohc=yqkltsyNwG0AX_3iZns&oh=cfe88cf48e6089b8cb2d72218a1a3cd5&oe=5F989841";
		for(int i = 0;i<2;i++){
			lp.clickNext().click();
			try{
				String tmpimagevalue = driver.findElement(By.xpath("//section[@class='EDfFK ygqzn']//img")).getCssValue("src");
					System.out.println(driver.getCurrentUrl());
			}
			catch(Exception e){
			}
		}
		lp.closeDialog().click();
		lp.menuicon().click();
		lp.logout().click();
	}	
	
	@AfterClass()
	public void tearDown(){
		System.out.println("Insta2 teardown");
		driver.quit();
	}

}
