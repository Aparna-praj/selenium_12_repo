package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://automationexercise.com");
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise", "Home page is not visbible");
		Reporter.log("Home page is visible successfully", true);
		
		driver.findElement(By.partialLinkText("Signup")).click();
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login", "Login to  account is not visible");
		Reporter.log("Login to account is visible", true);
		
		driver.findElement(By.name("email")).sendKeys("aparna5@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise", "Logged in as username is not visible");
		Reporter.log("Logged in as username' is visible",true);
		
		driver.findElement(By.partialLinkText("Delete Account")).click();
		String Msg = driver.findElement(By.xpath("//b[text()='Account Deleted!']")).getText();
		
		Assert.assertEquals(Msg, "ACCOUNT DELETED!", "ACCOUNT DELETED!' is not visible");
		Reporter.log("ACCOUNT DELETED!' is visible",true);
	}

}
