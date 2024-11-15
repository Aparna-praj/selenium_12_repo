package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment1 {
	@Test(priority = 1, invocationCount = 2)
	public void createAccount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Reporter.log("Account created sucessful", true);
		
	}
	
	@Test(priority = 3)
	public void deleteAccount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Reporter.log("Deleted Account successfully", true);
		
	}

	@Test(priority = 2, invocationCount = 3,threadPoolSize = 3)
	public void editAccount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Reporter.log("Edited account succesfully", true);
	}
}
