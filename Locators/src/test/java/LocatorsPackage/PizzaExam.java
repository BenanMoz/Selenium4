package LocatorsPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class PizzaExam {
    WebDriver driver;
    private String privateName = "Benan";
    private String familyName = "Mozalbet";

    @BeforeClass
    public void login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/pizza/");
    }


    @Test
    public void Test01() throws Exception {
        WebElement firstPrice = driver.findElement(By.xpath("//span[@class='ginput_total ginput_total_5']"));
        // verify firstPrice is 7.5$
        assertEquals(firstPrice.getText(), "$7.50", "first price is wrong");

        //insert first and last name
        WebElement firstName = driver.findElement(By.id("input_5_22_3"));
        WebElement lastName = driver.findElement(By.id("input_5_22_6"));
        firstName.sendKeys(privateName);
        lastName.sendKeys(familyName);

        //change he comboBox to Deleviry
        Select se = new Select(driver.findElement(By.cssSelector("select[name='input_21']")));
        se.selectByVisibleText("Delivery +$3.00");

        //assert price is changed
        assertEquals(firstPrice.getText(), "$10.50", "price become wrong now");


        //get the coupon number and insert it
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='coupon.html']"));
        driver.switchTo().frame(iframe);
        WebElement coupon = driver.findElement(By.id("coupon_Number"));
        String ext = coupon.getText();

        driver.switchTo().defaultContent();   //back to parent default frame
        WebElement CouponInputText = driver.findElement(By.xpath("//textarea[@id='input_5_20']"));
        CouponInputText.sendKeys(ext);


        //submit order
        driver.findElement(By.cssSelector("#gform_submit_button_5")).click();

        //Alert popup
        Alert alerte = driver.switchTo().alert();
        String texInPopup = alerte.getText();
        //System.out.println(texInPopup);
        String[] texts = texInPopup.split(" ");
        System.out.println(texts[0]);
        System.out.println(texts[1]);
        System.out.println(texts[2]);

        //validate the text in popup
        assertEquals(privateName, texts[0]);
        assertEquals(familyName, texts[1]);
        assertEquals(ext, texts[2]);


        //close the popup
        Thread.sleep(4000);
        alerte.accept();

    }
@AfterClass
        public void closeBrowser()  {

            driver.quit();
        }
    }






