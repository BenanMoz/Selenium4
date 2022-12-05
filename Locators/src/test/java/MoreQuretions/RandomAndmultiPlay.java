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

public class RandomAndmultiPlay {


    WebDriver driver;

    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.random.org/");
        Thread.sleep(4000);
    }

    @Test
public void test01() throws  Exception {
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://www.random.org/widgets/integers/iframe.php?title=True+Random+Number+Generator&buttontxt=Generate&width=160&height=230&border=on&bgcolor=%23FFFFFF&txtcolor=%23777777&altbgcolor=%23CCCCFFA&alttxtcolor=%23000000&defaultmin=1&defaultmax=100&fixed=off']"));
        driver.switchTo().frame(iframe);
        List<WebElement> listo = driver.findElements(By.xpath("//input[@type='number']"));
        listo.get(1).clear();
       listo.get(1).sendKeys("10");
        driver.findElement(By.xpath("//input[@value='Generate']")).click();
        Thread.sleep(3000);
        String s = driver.findElement(By.xpath("//span[@style='font-size:100%;font-weight:bold;']")).getText();

        driver.switchTo().defaultContent();
        driver.get("http://juliemr.github.io/protractor-demo/");


        //second site
        WebElement ele3 = driver.findElement(By.xpath("//input[@ng-model='first']"));
        WebElement ele4 = driver.findElement(By.xpath("//input[@ng-model='second']"));
        WebElement ele5 = driver.findElement(By.id("gobutton"));
        Select se = new Select(driver.findElement(By.xpath("//select[@ng-model='operator']")));
        se.selectByVisibleText("*");
        int total = 0;


        for (int j = 0; j < Integer.parseInt(s); j = j + 1) {
            ele3.sendKeys(s);
            ele4.sendKeys("" + j);
            ele5.click();
            Thread.sleep(5000);
            WebElement eler = driver.findElement(By.xpath("//h2[@class='ng-binding']"));
            total = Integer.parseInt(eler.getText()) + total;
          //  ele3.clear();

        }
        System.out.println(total);

    }}