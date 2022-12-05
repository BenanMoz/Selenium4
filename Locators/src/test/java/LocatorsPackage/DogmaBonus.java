package LocatorsPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DogmaBonus {
    ChromeDriver driver;

    @BeforeClass
    public void navigate() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/ex_controllers.html");

    }
    @Test
    public void nnn() {
        WebElement we1 = driver.findElement(By.cssSelector("input[name='firstname']"));
        we1.sendKeys("Benan");
        WebElement we2 = driver.findElement(By.cssSelector("input[name='lastname']"));
        we2.sendKeys("Mozalbet");
        WebElement we3 = driver.findElement(By.id("sex-0"));
        we3.click();
        WebElement we4 = driver.findElement(By.xpath("//p/input[@id='exp-0']"));
        we4.click();
        WebElement we5 = driver.findElement(By.name("datepicker"));
        we5.click();

        //Date picker
        WebElement datewidge = driver.findElement(By.cssSelector(".ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all"));
        List<WebElement> elai = datewidge.findElements(By.tagName("td"));
        for (WebElement elo : elai) {
            if (elo.getText().equals("3")) {
                elo.click();
                break;
            }
        }
        driver.findElement(By.xpath("//*[@id='profession-0']")).click();

        //using upload file
        driver.findElement(By.cssSelector("input[class = 'input-file']")).sendKeys("/Users/bmzalbat/IdeaProjects/dato/web/target/ROOT/WEB-INF/lib/ab.csv");

        //using list and select the fourth element from type checkBox
        driver.findElements(By.cssSelector("input[type='checkbox']")).get(4).click();


        Select se = new Select(driver.findElement(By.id("continents")));
        se.selectByVisibleText("Asia");


        WebElement we33 = driver.findElement(By.xpath("//option[@value='browser']"));

        WebElement we10 = driver.findElement(By.id("submit"));
        we10.click();

        //split
        String see = driver.getCurrentUrl();
        String[] myText = see.split("=");
        //System.out.println(myText[5]);
        String[] see2 = myText[5].split("%2F");
        System.out.println(see2[0]);
        System.out.println(see2[1]);
        String[] g = see2[2].split("&");
        System.out.println(g[0]);
        System.out.println(see2[0] + "." + see2[1] + "." + g[0]);
    }


        @AfterClass
        public void close() {
           // driver.quit();
        }


       /* String se3 = driver.getCurrentUrl();
        if(se3.contains("firstname=Benan&lastname=Mozalbet")){
            System.out.println("contains");}
        else
        System.out.println("no");*/
    }










