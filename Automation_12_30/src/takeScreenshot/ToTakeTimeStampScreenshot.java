package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeTimeStampScreenshot {

	public static void main(String[] args) throws IOException {
		
		/*LocalDateTime timestamp = LocalDateTime.now();
		 String time = timestamp.toString().replace(":", "-");
		 */
		
		String time = LocalDateTime.now().toString().replace(":", "-");
	    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+time+".png");
		FileHandler.copy(temp, dest);

	}

}