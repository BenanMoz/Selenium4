package sikuliandDatadriven;

import io.qameta.allure.Attachment;
import markoJakobsActionsAndAllure.base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class listenerso1 extends base1 implements ITestListener
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
        System.out.println("test success ended");
    }

    public void onTestFailure(ITestResult test)
    {
       //savecreenshot(driver);
       System.out.println("Tests failed - price are higher than ");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // TODO Auto-generated method stub
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] savecreenshot(WebDriver driver) {
        return  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public void onTestSkipped(ITestResult test){
        // TODO Auto-generated method stub
    }
}