package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public LoginPage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	
	By username = By.name("username");
	By password = By.name("password");
	By login = By.cssSelector("button[type='submit']");
	By title = By.xpath("/html/body/div/header/nav/div/ul/li/a/span");
	
	
	public WebElement emailID(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		return driver.findElement(username);
	}
	
	public WebElement password(){
		return driver.findElement(password);
	}

	public WebElement login(){
		wait.until(ExpectedConditions.elementToBeClickable(login));
		return driver.findElement(login);
	}

	public String getTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(title));
		return driver.findElement(title).getText();
	}

}
