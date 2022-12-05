package sikuliandDatadriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDriven {

    WebDriver driver;


    @BeforeClass
    public void start() throws Exception{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(2000);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }

    @Test(dataProvider = "sasa")
    public void test01(String str, String expect ) throws Exception {
        WebElement ele1 = driver.findElement(By.id("searchInput"));
        ele1.sendKeys(str);
        driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
        Assert.assertEquals(expect,driver.findElement(By.id("firstHeading")).getText());
        Thread.sleep(3000);
        driver.navigate().back();

    }
    @DataProvider(name = "sasa")
    public Object[][] wikilist() {
      Object[][] obj = {{"Automation","Automation"},{"Israel","Israel"},{"BlahBlah","Search results"}};
            return obj;
            }

    }

