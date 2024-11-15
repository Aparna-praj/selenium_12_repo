package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A2MouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement kidsLink = driver.findElement(By.partialLinkText("KIDS"));
		
		Actions act=new Actions(driver);
		act.moveToElement(kidsLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Ethnic Wear")).click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.myntra.com/ki-etnhc?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false")) {
			System.out.println("Ethnic wear page is displayed");
		}
		else {
			System.out.println("page is not displayed");
		}
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/pageImage.png");
		FileHandler.copy(temp, dest);

	}

}
