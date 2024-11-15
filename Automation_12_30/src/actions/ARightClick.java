package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ARightClick {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://demoapps.qspiders.com/");
    driver.findElement(By.xpath("//main[contains(@class,'w-[100%] h-[14.5rem] ps')]")).click();
    driver.findElement(By.xpath("//section[text()='Button']")).click();
    Thread.sleep(2000);
    driver.findElement(By.partialLinkText("Right Click")).click();
    
    Actions act=new Actions(driver);
    WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click']"));
    Thread.sleep(2000);

    act.contextClick(rightClickButton).perform();
    driver.findElement(By.xpath("//div[text()='Yes']")).click();
    
    String successMsg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
	System.out.println(successMsg);
	
	WebElement printColor = driver.findElement(By.xpath("//button[text()='Right Click']"));
	String color = printColor.getCssValue("Color");
	System.out.println("color -"+color);
	String text = printColor.getText();
	System.out.println("text -"+text);
	
	

	

    
	}

}
