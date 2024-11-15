package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class TestScript extends BaseClass{
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle="Demo Web Shop. Books";
		if(actualTitle.equals(expectedTitle)) {
			Reporter.log("Books page is displayed", true);
		}
		else {
			Reporter.log("Books page is not displayed", true);
		}
	}

}
