package Listenersss;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Implementingclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	Reporter.log("failed to login",true);
	}
	

}
