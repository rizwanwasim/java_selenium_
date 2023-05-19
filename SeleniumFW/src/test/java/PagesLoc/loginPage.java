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
}
