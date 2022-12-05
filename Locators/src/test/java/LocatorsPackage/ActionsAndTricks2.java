package LocatorsPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(listeners.class)
public class ActionsAndTricks2 {

    WebDriver driver;

    @BeforeClass
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fe-connectors-gallery-more-info-platform.datorama.io/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test //hover
    public void test04() throws Exception{
        Thread.sleep(6000);
        WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));

        ele.sendKeys("chucknorris@datorama.com");
        WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
        ele2.sendKeys("Datorama01!!");
        driver.findElement(By.xpath("//button[@class='d-flex d-flex-row align-center']")).click();
    }

    @Test
    public void test05() throws Exception {
        Actions action = new Actions(driver);
        WebElement ele3 = driver.findElement(By.id("18dd3d95-9697-40e9-8eb6-c181517db50b"));
        ele3.click();
        Thread.sleep(5000);
        //     switch ti iframe
        WebElement ele88 = driver.findElement(By.id("legacyFrame"));
        driver.switchTo().frame(ele88);
        Thread.sleep(8000);
        WebElement ele1 = driver.findElement(By.xpath("//da-vendor-card)[@data-auto-id='connectors-gallery.marketing-vendor.Adjust']"));
        WebElement ele2 = driver.findElement(By.xpath("//da-vendor-card[3]/div/div[3]/dato-link/a"));
        action.moveToElement(ele1).moveToElement(ele2).click();
        action.build().perform();
    }









}
