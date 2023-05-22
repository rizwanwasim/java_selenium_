 package PagesLoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	
	private static WebElement UserEle=null;
	private static WebElement PassEle = null;
	private static WebElement elemnt = null;
	private static WebElement loginBtn = null;

	public static WebElement username(WebDriver driver, WebDriverWait wait ) {
		
//		UserEle = driver.findElement(By.name("q"));
		UserEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		return UserEle;
	}
	
	public static WebElement password(WebDriver driver, WebDriverWait wait) {
		
//		PassEle = driver.findElement(By.name("pass"));
		PassEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		return PassEle;
	}
	
	public static WebElement button(WebDriver driver, WebDriverWait wait) {
		
//		PassEle = driver.findElement(By.name("pass"));
		loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form:nth-child(2) div.oxd-form-actions.orangehrm-login-action:nth-child(4) > button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
		return loginBtn;
	}
}
