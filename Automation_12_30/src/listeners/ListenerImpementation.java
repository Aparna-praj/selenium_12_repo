package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImpementation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Testscript is failed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Testscript is passed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestScript is skipped", true);
	}
	
	

}
