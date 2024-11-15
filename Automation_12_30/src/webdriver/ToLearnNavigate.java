package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnNavigate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.redbus.in/");
		//driver.navigate().to("https://www.redbus.in/");
		driver.navigate().to(new URL("https://ww w.redbus.in/"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
	}

}
