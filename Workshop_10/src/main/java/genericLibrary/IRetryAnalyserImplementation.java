package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/***
 * 
 * @author Dhanraj MV
 *
 */
public class IRetryAnalyserImplementation implements IRetryAnalyzer {

	int count=0;
	int retryCount=2;

	public boolean retry(ITestResult result) {
		if(count<=retryCount) {
			count++;
			return true;
		}
		return false;
	}

}
