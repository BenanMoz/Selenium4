package sikuliandDatadriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDrivenWithOutsideClass {

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

    @Test(dataProviderClass = Data_Providers.class, dataProvider = "regTests")
    public void test01(String str, String expect ) throws Exception {
        WebElement ele1 = driver.findElement(By.id("searchInput"));
        ele1.sendKeys(str);
        driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
        Assert.assertEquals(expect,driver.findElement(By.id("firstHeading")).getText());
        Thread.sleep(3000);
        driver.navigate().back();

    }


    }

