package RootCauseAna;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class listeners implements ITestListener
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

    public void onTestSuccess(ITestResult test) {
        System.out.println("test success ended");
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    } //tbd - remove the file

    public void onTestFailure(ITestResult test) {
        System.out.println("Tests failed");
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // TODO Auto-generated method stub
    }

    public void onTestSkipped(ITestResult test){
        // TODO Auto-generated method stub
    }
}



