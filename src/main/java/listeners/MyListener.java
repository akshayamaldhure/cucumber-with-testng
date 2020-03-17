package listeners;

import lombok.extern.log4j.Log4j2;
import org.testng.*;

@Log4j2
public class MyListener implements ITestListener, ISuiteListener {

    public void onTestStart(ITestResult result) {
        log.info("Starting test " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        log.info("Test " + result.getName() + " has been passed");
    }

    public void onTestFailure(ITestResult result) {
        log.info("Test " + result.getName() + " has been failed");
    }

    public void onTestSkipped(ITestResult result) {
        log.info("Test " + result.getName() + " has been skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }

    @Override
    public void onStart(ISuite suite) {
        log.info("Inside onStart-suite");
        log.info("I can set up WebDriver here");
        log.info("Or I can set up my API client here");
    }

    @Override
    public void onFinish(ISuite suite) {
        log.info("Inside onFinish-suite");
        log.info("I can tear down WebDriver here");
    }
}
