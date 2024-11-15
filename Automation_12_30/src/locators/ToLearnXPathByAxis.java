package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXPathByAxis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/aparn/OneDrive/Desktop/Movies.html");
		
	/*	String collection = driver.findElement(By.xpath("//td[text()='Salar']/following-sibling::td[1]")).getText();
		System.out.println(collection);
		*/
		String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
		System.out.println(collection);
		
		Object imdb = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td[1]")).getText();
		System.out.println(imdb);
	}

}
