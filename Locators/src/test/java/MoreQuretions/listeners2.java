package MoreQuretions;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class listeners2 implements ITestListener
{
    public void onStart(ITestContext execution){
        // TODO Auto-generated method stub
    }

    public void onFinish(ITestContext execution){
        System.out.println("test finish");
    }

    public void onTestStart(ITestResult test){
        System.out.println("test is starting");
    }

    public void onTestSuccess(ITestResult test){
        System.out.println("test fail - we found it");
    }

    public void onTestFailure(ITestResult test){
        System.out.println("Tests passed - we didnt found it");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult test){
        // TODO Auto-generated method stub
    }
}



