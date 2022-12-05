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
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.Listeners;

import static org.testng.Assert.*;

@Listeners(listeners.class)
public class ActionsAndTricks {

    WebDriver driver;

    @BeforeClass
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/ex_actions.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test //check drag and drop
    public void test01() {
        WebElement draggble = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(draggble, droppable).build().perform();
        String s = droppable.getText();
        assertEquals(s, "Dropped!");
    }

    @Test //check doubleclick
    public void test02() {
        WebElement dclick = driver.findElement(By.id("dbl_click"));
        Actions action = new Actions(driver);
        action.doubleClick(dclick);
        action.build().perform();
        String se = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        assertEquals(se, "Hello World");
    }


    @Test //check multi select
    public void test03() {
        List<WebElement> elai = driver.findElements(By.xpath("//ol[@id='select_items']/li"));
        Actions action = new Actions(driver);
        action.clickAndHold(elai.get(1)).clickAndHold(elai.get(2));
        action.build().perform();


    }

    @Test //hover
    public void test04() {
        Actions action = new Actions(driver);
        WebElement dclick = driver.findElement(By.id("mouse_hover"));
        action.moveToElement(dclick).click();
        action.build().perform();
        String color = dclick.getAttribute("style");
        System.out.println(color);
        Boolean ae = color.contains("rgb");
        assertTrue(ae);

    }

    @Test //scrooling
    public void test05() {
        WebElement element = driver.findElement(By.id("scrolled_element"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        assertEquals(driver.findElement(By.id("scrolled_element")).getText(), "This Element is Shown When Scrolled");
    }

   @AfterClass
    public void end() {
        driver.quit();
    }





}
