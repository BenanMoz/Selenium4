package LocatorsPackage;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

import static org.testng.Assert.assertEquals;

public class ExternalFile {

    WebDriver driver;
    // Imports
    // Function
    public String getData (String nodeName) {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./confi.xml");
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


    }

    @Test
    public void test01() {
        WebElement weighto = driver.findElement(By.id("weight"));
        weighto.sendKeys(getData("weight"));
        WebElement height = driver.findElement(By.cssSelector("#hight"));
        height.sendKeys(getData("height"));
        WebElement fe = driver.findElements(By.cssSelector("input[class='button']")).get(0);
        fe.click();
        WebElement res = driver.findElement(By.id("bmi_result"));
        String val = res.getAttribute("value");
        System.out.println(val);
        assertEquals(val,getData("expected"), "sorry");
    }

@AfterClass
    public void test02(){
        driver.quit();
    }
}










