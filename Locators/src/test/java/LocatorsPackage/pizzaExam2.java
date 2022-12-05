package LocatorsPackage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners (listeners.class)
public class pizzaExam2 {

 WebDriver driver;

    @BeforeClass
    public void login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/pizza/");
    }

    @Test
    public void test01() {
        WebElement ele = driver.findElement(By.xpath("//span[@class='ginput_total ginput_total_5']"));
        String g = ele.getText();
        assertEquals(g, "$7.50", "first is wrong");
    }

    @Test
    public void test02() {
        driver.findElement(By.name("input_22.3")).sendKeys("Benan");
        driver.findElement(By.name("input_22.6")).sendKeys("Mozalbet");
        String s = driver.findElement(By.xpath("//li[@id='field_5_18']/h2[@class='gsection_title']")).getText();
        assertEquals("Let's Get Started", s);
        //change he comboBox to Deleviry
        Select se = new Select(driver.findElement(By.cssSelector("select[name='input_21']")));
        se.selectByVisibleText("Delivery +$3.00");

        WebElement ele2 = driver.findElement(By.xpath("//span[@class='ginput_total ginput_total_5']"));

        assertEquals(ele2.getText() , "$10.50");
    }


    @Test
    public void test03() {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='coupon.html']"));
       // WebElement elefr = driver.findElement(By.cssSelector("iframe[src='coupon.html']"));
        driver.switchTo().frame(iframe);
        WebElement coupon = driver.findElement(By.id("coupon_Number"));
        String ext = coupon.getText();

        driver.switchTo().defaultContent();   //back to parent default frame
        WebElement CouponInputText = driver.findElement(By.xpath("//textarea[@id='input_5_20']"));
        CouponInputText.sendKeys(ext);
        driver.findElement(By.id("gform_submit_button_5")).click();
        Alert ale = driver.switchTo().alert();
        ale.accept();
    }




    }



