package TestLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesLoc.loginPage;

public class LoginPageTestNG {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	
//	public static void main(String[] args) {
//		loginPage();
//	}
//	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public static void loginPage() {
		
//		driver = new ChromeDriver();
//		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get("https://www.google.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Wait for the input field to be visible
//        WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//		Username.sendKeys("Admin");
//		WebElement passname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//		passname.sendKeys("admin123");
		loginPage.username(driver,wait).sendKeys("Admin");
		loginPage.password(driver,wait).sendKeys("admin123");
		// Locate the button element
//        WebElement button = driver.findElement(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form:nth-child(2) div.oxd-form-actions.orangehrm-login-action:nth-child(4) > button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
		loginPage.button(driver, wait).click();
//		System.out.println("username");
     // Click the buttonpub
//        button.click();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
