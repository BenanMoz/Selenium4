package LocatorsPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class hoverDatorama {

    WebDriver driver;
    Actions action = new Actions(driver);

    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fe-connectors-gallery-more-info-platform.datorama.io/");
        Thread.sleep(7000);

    }

    @Test
    public void test01() throws Exception {
        Thread.sleep(6000);
        WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));

        ele.sendKeys("chucknorris@datorama.com");
        WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
        ele2.sendKeys("Datorama01!!");
        driver.findElement(By.xpath("//button[@class='d-flex d-flex-row align-center']")).click();
    }

    @Test
    public void test02() {
        WebElement ele1 = driver.findElement(By.xpath("//da-vendor-card)[@data-auto-id='connectors-gallery.marketing-vendor.Adjust']"));
        WebElement ele2 = driver.findElement(By.xpath("//da-vendor-card[3]/div/div[3]/dato-link/a"));
        action.moveToElement(ele1).moveToElement(ele2).click();
        action.build().perform();
    }


}

