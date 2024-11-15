package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
	//	WelcomePage wp=new WelcomePage(driver); //page class object creation
	//	wp.getRegisterLink().click(); //calling getter() method of register element
		
		LoginPage lp=new LoginPage(driver);
		lp.getLoginButton().click();
		
		lp.getEmailTextField().sendKeys("testing1@gmail.com");

		lp.getPasswordTextField().sendKeys("1234");
		
		lp.getLoginButton().click();

	}

}
