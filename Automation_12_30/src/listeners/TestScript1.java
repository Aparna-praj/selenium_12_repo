package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersImplementation1.class)
public class TestScript1 extends BaseClass{
	@Test
	public void login() {
		Reporter.log("Click on login", true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("Enter valid credentials", true);
		driver.findElement(By.id("Email")).sendKeys("alex4@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		
		Reporter.log("Click on login button", true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "home page is not displayed");
		Reporter.log("Home page is displayed", true);
	}

}
