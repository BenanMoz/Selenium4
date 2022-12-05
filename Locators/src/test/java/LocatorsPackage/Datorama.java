package LocatorsPackage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Datorama {


    ChromeDriver driver;

    @BeforeClass
    public void navigate()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.ghostinspector.com/account/login?redirect=%2F");

    }

  @Test
    public void nnn(){
      WebElement we1 = driver.findElement(By.cssSelector("div[class='menu-item-button hidden-xs']"));
      we1.click();
      WebElement we2 = driver.findElement(By.cssSelector("input[ng-model='account.firstName']"));
      we2.sendKeys("Ben");
      WebElement we3 = driver.findElement(By.cssSelector("input[ng-model = 'account.lastName']"));
      we3.sendKeys("Ben");
      WebElement we4 = driver.findElement(By.xpath("//*[@id='input-companyName']"));
      we4.sendKeys("sales");
      Select se1 = new Select(driver.findElementByCssSelector("Select[ng-model='user.companySize']"));
      se1.selectByVisibleText("10-50");

      WebElement we5 = driver.findElement(By.id("input-position"));
      we5.sendKeys("qa");

     // WebElement we6 = driver.findElement
           //   (By.cssSelector(".form-control.ng-valid-maxlength.ng-dirty.ng-valid-parse.ng-touched.ng-not-empty.ng-valid-required.ng-valid.ng-valid-email"));

      WebElement we7 = driver.findElement(By.cssSelector("input[ng-model = 'account.email']"));
      we7.sendKeys("Ben@Ben");
      we7.clear();
      we7.sendKeys("Ben@Ben");



      WebElement we8 = driver.findElement(By.xpath("//div/input[@ng-model='account.password']"));
      we8.sendKeys("12345678");

      WebElement we9 = driver.findElement(By.className("checkbox-display"));
      we9.click();

      //WebElement we10= driver.findElement(By.xpath("//*[@id='recaptcha-anchor]/div[1]']"));
    //  we10.click();

      WebElement we13 = driver.findElement(By.cssSelector("div[class='rc-inline-block']"));
      we13.click();

    //  WebElement we11 = driver.findElement(By.cssSelector("rc-anchor-logo-img.rc-anchor-logo-img-portrait"));

     // we11.click();
    //  we11.click();



  }
}
