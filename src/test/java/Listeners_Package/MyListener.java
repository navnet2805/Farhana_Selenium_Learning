package Listeners_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test started: " +result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test passed: " +result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test failed: " +result.getTestName());
    }

    @Override
    public void onFinish(ITestContext context)
    {
        System.out.println("Test finish");
    }


}
