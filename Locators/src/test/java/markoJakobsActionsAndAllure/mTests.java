package markoJakobsActionsAndAllure;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


@Listeners(listenerso.class)
public class mTests  extends base{

    @BeforeClass
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Actions(driver);
        driver.get("https://marcojakob.github.io/dart-dnd/basic/");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


@Test(description = "drag AND drop")
@Description("this drag first element")
    public void test01()
   {
      dragginganddrop();
        verify();

   }
      @AfterClass
    public  void end() throws Exception{
        Thread.sleep(3000);
        driver.quit();
      }

      @Step ("drag the element")
    public void dragginganddrop() {
          WebElement draggble = driver.findElement(By.xpath("//img[@class='doclcdument']"));
          WebElement droppable = driver.findElement(By.className("trash"));
          action.dragAndDrop(draggble, droppable).build().perform();

      }
      @Step ("verify bin include data")
    public void verify() {
          assertTrue(driver.findElement(By.cssSelector("div[class='trash full")).isDisplayed());
      }
    }




