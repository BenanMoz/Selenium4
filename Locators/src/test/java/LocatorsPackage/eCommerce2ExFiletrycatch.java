package LocatorsPackage;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import org.w3c.dom.Document;

public class eCommerce2ExFiletrycatch {
    WebDriver driver;
    String a="€2d3.22";



    public String getData (String nodeName) {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./confi2.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }


    @BeforeClass
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getData("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test01() {

        try {

            WebElement ele1 = driver.findElement(By.linkText("Books"));
            ele1.click();
            Select se = new Select(driver.findElement(By.id("customerCurrency")));
            se.selectByVisibleText(getData("currency"));
            String ac = driver.findElement(By.xpath("//span[@class='price actual-price']")).getText();
            assertEquals(ac, a);
        } catch (Exception e) {
            System.out.println("an error roro " + e);
            fail("error rororororor");

        } catch (AssertionError ee) {
            System.out.println(ee);
            fail("assertion failed");
        }
    }

    @AfterClass
    public void closee(){
        driver.quit();
    }


}
