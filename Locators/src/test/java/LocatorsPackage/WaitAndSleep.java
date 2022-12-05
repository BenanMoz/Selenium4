package LocatorsPackage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class WaitAndSleep {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/ex_synchronization.html");

        //eplicity wait here
        wait = new WebDriverWait(driver, 7);

        //this for implicit wait
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Test(enabled = false) //this for implicity wait test
    public void site01() {
        WebElement ele4 = driver.findElement(By.id("btn"));
        ele4.click();
        WebElement ele5 = driver.findElement(By.id("message"));
        assertTrue(ele5.isDisplayed());
    }

    @Test
    public void site02() {
        WebElement ele6 = driver.findElement(By.id("rendered"));
        ele6.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish2")));
        String output = driver.findElement(By.id("finish2")).getText();
        assertEquals(output, "My Rendered Element After Fact!");


    }

    @AfterClass
    public void closee() {
        driver.quit();
    }


}