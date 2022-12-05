package LocatorsPackage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;



public class mortgageCalc {

    WebDriver driver;

    @BeforeClass
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mortgagecalculator.org/");

    }

    @Test
    public void test011()
    {
        WebElement ele1 = driver.findElement(By.cssSelector(".highcharts-legend-item.highcharts-column-series.highcharts-color-undefined.highcharts-series-0"));
        ele1.click();
        WebElement ele2 = driver.findElement(By.id("homeval"));
        assertEquals(ele2.getAttribute("value"),"300000");
        ele2.sendKeys("100000");
        WebElement ele3 = driver.findElement(By.xpath("//label[2]/input"));
        assertFalse(ele3.isSelected(),"sorry,should be not enabled");
        WebElement ele4 = driver.findElement(By.cssSelector("label[for='loanterm']"));
        assertEquals(ele4.getText(), "Loan Term:");
        ele4.click();

        driver.findElement(By.id("loanterm")).sendKeys("20");
        Select s = new Select(driver.findElement(By.xpath("//select[@name='param[start_month]']")));
        WebElement we = s.getOptions().get(0);
        assertTrue(we.isDisplayed(),"no its not");
        s.selectByVisibleText("Feb");
        driver.findElement(By.cssSelector("input[value='Compare Loan Types']")).click();
        driver.findElement(By.id("cboxClose")).click();



    }

}
