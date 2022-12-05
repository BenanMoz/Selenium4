package LocatorsPackage;

import com.sun.tools.internal.xjc.reader.xmlschema.BindYellow;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
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

public class SwitchAndNav {
    WebDriver driver;
    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/ex_switch_navigation.html");
        Thread.sleep(7000);

    }

    @Test
    public void Site01() throws Exception {
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("btnAlert"));
        ele.click();
        Alert popup = driver.switchTo().alert();
        System.out.println(popup.getText());
        popup.accept();
        WebElement ele2 = driver.findElement(By.id("output"));
        String n = ele2.getText();
        assertEquals(n,"Alert is gone.");

         WebElement ele3  =driver.findElement(By.id("btnPrompt"));
         ele3.click();
         Alert popup2 = driver.switchTo().alert();
        System.out.println(popup2.getText());
        popup2.sendKeys("Benan");
        popup2.accept();
        WebElement ele4 = driver.findElement(By.id("output"));
        String m = ele4.getText();
        assertEquals(m,"Benan");
        WebElement ifrm = driver.findElement(By.xpath("//iframe[@src='ex_switch_newFrame.html']"));
        driver.switchTo().frame(ifrm);

        WebElement ele88 = driver.findElement(By.id("iframe_container"));
        System.out.println(ele88.getText());
        String expe = "This is an IFrame !";
        assertEquals(expe,ele88.getText(), "SORRRY");

        driver.switchTo().defaultContent();
        String winHandleBefore = driver.getWindowHandle();
        driver.findElement(By.id("btnNewTab")).click();

        Set<String> win = driver.getWindowHandles();
        for(String wi : win) {
            driver.switchTo().window(wi);
            if(driver.getCurrentUrl().equals("https://atidcollege.co.il/Xamples/ex_switch_newTab.html")){
                break;
            }
        }
          WebElement ele0 = driver.findElement(By.id("new_tab_container"));
        System.out.println(ele0.getText());
        driver.switchTo().window(winHandleBefore);
        driver.findElement(By.id("btnPrompt")).click();



    }

}
