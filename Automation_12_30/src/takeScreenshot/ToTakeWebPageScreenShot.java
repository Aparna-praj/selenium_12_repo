package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeWebPageScreenShot {

	public static  void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//here by using driver we cannot call getScreenshot() instead you want to do typecasting,
		//because webdriver(I) is not having any connection with takescreenshot interface
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		//here bydefault  screenshot taken will be stored in the temp directory and after few minutes it will be vanishes
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File dest=new File("./Screenshot/image.png");
		FileHandler.copy(temp, dest);
		
		

	}

}
