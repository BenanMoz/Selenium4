package MoreQuretions;

import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ElementNotExistVerified {
    WebDriver driver;


    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/ex_synchronization.html");
        Thread.sleep(4000);
    }


    @Test
    public void test01_WithTryCatch() {
        try {
            //driver.findElement(By.id("btn")).click();
            Thread.sleep(5000);
            driver.findElement(By.id("checkbox"));
            System.out.println("Test01 Failed - Element exists on screen");
        } catch (Exception e) {
            System.out.println("Test01 Passed - Element does NOT exist on screen");
        }
    }
}


