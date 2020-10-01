package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public LandingPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	
	By search=By.cssSelector("input[type='text'][placeholder='Search']");
	By searchelementwordporm= By.cssSelector("a[href='/wordporm/']");
	By searchelementscribbledstories= By.cssSelector("a[href='/thescribbledstories/']");
	By article= By.className("eLAPa");
	By closedialog= By.xpath("//div[@class='_2dDPU  CkGkG']/div[3]/button/div");
	By likesection = By.xpath("//section[@class='EDfFK ygqzn']");
	By menuicon= By.xpath("//div[@class='Fifk5'][5]/span");
	By logout= By.xpath("//div[text()='Log Out']");
	By nextbutton=By.xpath("//a[text()='Next']");
	
	public WebElement logout(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(logout));
		return driver.findElement(logout);		 
	}
	
	public WebElement menuicon(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(menuicon));
		return driver.findElement(menuicon);		 
	}
	
	public WebElement closeDialog(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(closedialog));
		return driver.findElement(closedialog);		 
	}
	
	public WebElement searchtext(){
		System.out.println(driver);
		driver.findElement(search);
		wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		return driver.findElement(search);		 
	}
	

	public WebElement searchElementScribbledStories() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchelementscribbledstories));
		return driver.findElement(searchelementscribbledstories);
	}
	
	public WebElement searchElementWordPorm() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchelementwordporm));
		return driver.findElement(searchelementwordporm);
	}
	
	public List<WebElement> getArticles() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOfElementLocated(article));
		return driver.findElements(article);
	}
	public WebElement likesection(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(likesection));
		return driver.findElement(likesection);		 
	}
	
	public WebElement clickNext(){
		driver.switchTo().activeElement();
		wait.until(ExpectedConditions.visibilityOfElementLocated(nextbutton));
		wait.until(ExpectedConditions.visibilityOfElementLocated(likesection));
		return driver.findElement(nextbutton);		 
	}

}
