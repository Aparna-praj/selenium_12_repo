package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment21Sep {

	public static void main(String[] args) throws IOException 
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
			System.out.println("app displayed");
		}
		else {
			System.out.println("app not displayed");
		}
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);

        TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+time+".png");
		FileHandler.copy(temp, dest);
	}

}
