package LocatorsPackage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class Loudev {

    WebDriver driver;


    @BeforeClass
    public void navigate() {
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.safaridriver().setup();
       driver = new ChromeDriver();
        driver = new SafariDriver();
       driver.manage().window().maximize();
        driver.get("https://loudev.com");

    }

    @Test
    public void check(){
        String s = null;
        int j = 0;
        List<WebElement> ELE2 = driver.findElements(By.xpath("//div[@class='hero-multiselect']/div[@class='ms-container']/div[@class='ms-selectable']/ul[@class='ms-list']/li[@class='ms-elem-selectable']"));
       for(int i=0 ; i<ELE2.size(); i++)
       {
           if(!ELE2.get(i).getAttribute("class").contains("ms-seleced")){

       }
           j=i+3;
           s="elem" + " " + j;
           assertEquals(ELE2.get(i).getText() , s);
       }


    }

}