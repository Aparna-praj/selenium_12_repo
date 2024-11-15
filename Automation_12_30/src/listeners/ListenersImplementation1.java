package listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation1 extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(driver);
		String methodName = result.getName();
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/" + methodName + timeStamp + ".png");
		try {
			FileHandler.copy(temp, dest);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
