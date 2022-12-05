package MoreQuretions;

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

public class calcWithSelenium {
    WebDriver driver;


    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://juliemr.github.io/protractor-demo/");
        Thread.sleep(4000);
    }

    @Test
    public void Test01() throws Exception {
        WebElement ele1 = driver.findElement(By.xpath("//input[@ng-model='first']"));
        WebElement ele2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
        WebElement ele3 = driver.findElement(By.id("gobutton"));
        Select se = new Select(driver.findElement(By.xpath("//select[@ng-model='operator']")));
        se.selectByVisibleText("*");

        for (int i = 1; i <= 3; i = i + 1) {
            for (int j = 1; j <= 3; j = j + 1) {
                ele1.sendKeys("" + i);
                ele2.sendKeys("" + j);
                ele3.click();
                Thread.sleep(5000);
                WebElement eler = driver.findElement(By.xpath("//h2[@class='ng-binding']"));
                //System.out.println(driver.findElement(By.xpath("//h2[@class='ng-binding']")).getText());
                // assertEquals(eler.getText(), "" + i*j );

            }
        }
        List<WebElement> lese = driver.findElements(By.xpath("//*/tr/td[@class='ng-binding']"));
        for(int i=1; i<18; i=i+2){
            System.out.println(lese.get(i).getText());
        }

    }


            @AfterClass
            public void endo () {
                driver.quit();
            }

        }