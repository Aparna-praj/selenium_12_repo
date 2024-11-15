package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AScrollWebpage {

	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.abhibus.com/");
	//   WebElement busBooking = driver.findElement(By.xpath("//div[@class='row card-body booking-services-content lighter ']"));
	   WebElement busBooking = driver.findElement(By.xpath("(//div[@class='container  fixed'])[2]"));
		
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(false)", busBooking);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/scrollPage.png");
		FileHandler.copy(temp, dest);
		
		
	}

}
