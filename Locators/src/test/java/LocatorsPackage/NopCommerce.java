package LocatorsPackage;

import com.sun.tools.internal.xjc.reader.xmlschema.BindYellow;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class NopCommerce {
    WebDriver driver;


    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(7000);

    }

    @Test
    public void Test01() {
        Select se = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
        se.selectByVisibleText("Price: Low to High");
        List<WebElement> li = driver.findElements(By.xpath("//div[@class='item-box']"));
        assertEquals(li.size(),3);
        List<WebElement> li2 = driver.findElements(By.xpath("//h2/a"));
        System.out.println(li2.get(0).getText());
        System.out.println(li2.get(1).getText());
        System.out.println(li2.get(2).getText());


        List<WebElement> woo = driver.findElements(By.xpath("//div[@class='rating']/div"));
        String s1 = woo.get(0).getAttribute("style");
        System.out.println(s1);


        }

        }



