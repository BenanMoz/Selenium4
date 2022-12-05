package LocatorsPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;


public class Datoo {

    WebDriver driver;

    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://platform.datorama.com/");
        Thread.sleep(7000);


    }

    @Test
    public void Site01() throws Exception {
        Thread.sleep(6000);
        WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));

        ele.sendKeys("benm@datoramas.com");
        WebElement ele2 = driver.findElement(By.xpath("//input[@type='password']"));
        ele2.sendKeys("Datorama01!!");
        driver.findElement(By.xpath("//button[@class='d-flex d-flex-row align-center']")).click();
    }

    @Test
    public void Site02() throws Exception {
        Thread.sleep(12000);
        WebElement ele3 = driver.findElement(By.id("18dd3d95-9697-40e9-8eb6-c181517db50b"));
        ele3.click();
        Thread.sleep(5000);
        //     switch ti iframe
        WebElement ele88 = driver.findElement(By.id("legacyFrame"));
        driver.switchTo().frame(ele88);
        Thread.sleep(9000);

        //ad new
        WebElement ele6 = driver.findElement(By.xpath("//button[@data-auto-id='createtcds_addnew']"));
        ele6.click();

       //searchFB
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Face");


        WebElement wee4 = driver.findElement(By.xpath("//div[@title='Facebook-Ads']"));
        String s = wee4.getAttribute("title");
        assertEquals(s, "Facebook-Ads");

        wee4.click();
        Thread.sleep(11000);
        //driver.switchTo().defaultContent();

     //  WebElement ele880 = driver.findElement(By.id("exportIFRAME"));
      // driver.switchTo().frame(ele880);

    //   Thread.sleep(3000);

        //creating FB
        //  WebElement ele90 = driver.findElement(By.xpath("//input[@class=from set-input-text date-input  hasDatepicker]"));
          // ele90.click();

        //WebElement ele100 = driver.findElement(By.xpath("//input[@type='checkbox' and @class='propertygetConversionsDate']"));
       // ele100.click();
    //   WebElement wew = driver.findElement(By.xpath("//*[@id='pageData']/div[1]/div[1]/div[3]/div[5]/div[2]/table/tbody/tr[2]/td/label/input"));
     //  wew.click();
       // System.out.println(ele100.getText());

        //press create and close
        driver.switchTo().defaultContent();

       WebElement w3 = driver.findElement(By.xpath("//dato-button[@data-auto-id='total-connect.create']"));
       w3.click();
       Thread.sleep(6000);


       //close
        driver.switchTo().frame(ele88);
        driver.findElement(By.xpath("//div[@class='close-button']")).click();
    }

    @Test
    public void Site03() throws Exception{
        Thread.sleep(3000);
        List<WebElement> lw4 = driver.findElements(By.xpath("//span[@class='k-icon k-filter']"));
        lw4.get(1).click();
      //  driver.findElement(By.xpath("//form[@class='k-filter-menu k-popup k-group k-reset k-state-border-up']")).click();
        driver.findElement(By.xpath("//span/input[@data-bind='value:filters[0].value']")).sendKeys("Face");


    }

        @AfterClass(enabled = false )
        public void closee () {
         //   driver.quit();
        }

}










