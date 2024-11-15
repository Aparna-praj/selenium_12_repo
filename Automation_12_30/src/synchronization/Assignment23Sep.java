package synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment23Sep {

	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//main[contains(@class,'w-[100%] h')]")).click();
        driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		
	    String url = driver.getCurrentUrl();
	    
	    if(url.equals("https://demoapps.qspiders.com/ui/table")) {
	    	System.out.println("table is displayed");
	    }
	    else {
	    	System.out.println("table is not displayed");
	    }
	    
	    driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
	    
	   String url1 = driver.getCurrentUrl();
	   
	   if(url1.equals("https://demoapps.qspiders.com/ui/table/dynamicTable")) {
		   System.out.println("dynamic web table is displayed");
	   }
	   else {
		   System.out.println("dynamic web table is not displayed");
	   }
	    
	   String price = driver.findElement(By.xpath("//th[text()='Apple iPhone']/..//td[contains(@class,'px-6 py-4 font-bold text-black')]")).getText();
	   System.out.println(price);
	   
	   TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+time+".png");
		FileHandler.copy(temp, dest);
	}

}
