package sikuliandDatadriven;
import io.github.bonigarcia.wdm.WebDriverManager;
import markoJakobsActionsAndAllure.listenerso;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Listeners(listenerso1.class)

public class interview3 {
    WebDriver driver;

    @BeforeClass
    public void start() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wooloverslondon.com/");
        Thread.sleep(2000);

    }

    @Test
    public void test01() throws Exception {
        WebElement ele1 = driver.findElement(By.id("onetrust-accept-btn-handler"));
        ele1.click();
        WebElement ele2 = driver.findElement(By.xpath("//input[@class='glDefaultBtn glCancelBtn']"));
        ele2.click();
        Thread.sleep(8000);
        WebElement ele3 = driver.findElement(By.id("onetrust-accept-btn-handler"));
        ele3.click();


        driver.findElement(By.xpath("//li[@class='dropdown hasSubmenu New Arrivals']")).click();


        //tbd currency

        //filter om man
        driver.findElement(By.id("dd-Gender")).click();
        driver.findElement(By.xpath("//div/div/div/a[@class='nav-link js-filter-link']")).click();
        driver.findElement(By.xpath("//div/div/div/a[@class='nav-link js-filter-link is-selected']")).click();
        Thread.sleep(5000);


        List<WebElement> le = driver.findElements(By.xpath("//div[@class='btn btn-block filter-group__close-btn js-toggle-close-all']"));
        le.get(0).click();
        Thread.sleep(5000);

        //filter on price
        driver.findElement(By.id("dd-Sort By")).click();
        // List<WebElement> lo = driver.findElements(By.xpath("//a[@class='nav-link js-sortby-link ']"));
        //lo.get(0).click();
        //lo.get(0).click();
        WebElement ele90 = driver.findElement(By.xpath("//span[text()='Price Low to High']"));
        ele90.click();
        Thread.sleep(4000);
        List<WebElement> le2 = driver.findElements(By.xpath("//div[@class='btn btn-block filter-group__close-btn js-toggle-close-all']"));
        le2.get(11).click();
        Thread.sleep(4000);

    }
    //verify prices

    @Test
    public void test02() {

        List<WebElement> we4 = driver.findElements(By.xpath("//*[@id='listing-container']/div/div/div/div/div/div/div/div/div[1]/div/p/span"));
        for (int i = 0; i < we4.size(); i = i + 1) {
            String s = we4.get(i).getAttribute("data-originalprice");
            System.out.println(s);
            String u = s.replace("$", "");
            double pr = Double.parseDouble(u);
            we4 = driver.findElements(By.xpath("//*[@id='listing-container']/div/div/div/div/div/div/div/div/div[1]/div/p/span"));

            Assert.assertTrue(pr <= 150);

        }
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}








