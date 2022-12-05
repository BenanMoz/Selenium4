package markoJakobsActionsAndAllure;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class interviewCreateTask {
    WebDriver driver;
    String firstName = "Ben" ;
    String secondName = "Moz";
    //String changeName = "Ben1" ;
    Actions action;

    @BeforeClass
    public void start() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        action = new Actions(driver);
        driver.get("https://todomvc.com/examples/react/#");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test //create task
    public void test01() throws Exception {
        WebElement ele1 = driver.findElement(By.cssSelector("input[class='new-todo']"));
        ele1.sendKeys(firstName);
        ele1.sendKeys(Keys.RETURN); //CLICK ON ENTER
        assertTrue(driver.findElement(By.cssSelector("section[class=main]")).isDisplayed());
        Thread.sleep(5000);
    }

    @Test //editing
    public void test02() throws Exception {
        WebElement ele4 = driver.findElement(By.xpath("//ul[@class='todo-list']/li"));
        action = new Actions(driver);
        action.doubleClick(ele4);
        action.build().perform();
        Thread.sleep(5000);
        WebElement ele5 = driver.findElement(By.xpath("//input[@class='edit']"));
        ele5.sendKeys("fff");
        ele5.sendKeys(Keys.RETURN);
        System.out.println(ele4.getText());
        assertEquals(ele4.getText(),"Benfff");
        Thread.sleep(5000);
    }
   @Test//check completed
    public void test03() throws Exception {
      WebElement ele6 = driver.findElement(By.xpath("//input[@class='toggle']"));
      ele6.click();
      WebElement ele7 = driver.findElement(By.linkText("Completed"));
      assertTrue(driver.findElement(By.xpath("//ul/li[@class='completed']")).isDisplayed());
       Thread.sleep(5000);
    }
 @Test //switch filters
    public void test04() throws Exception{
     WebElement ele1 = driver.findElement(By.cssSelector("input[class='new-todo']"));
     ele1.sendKeys(secondName);
     ele1.sendKeys(Keys.RETURN); //CLICK ON ENTER
     List<WebElement> li = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
     assertEquals(li.size(), 2);
     Thread.sleep(5000);


     //All
     driver.findElement(By.linkText("All")).click();
     assertEquals(li.size(), 2);
     Thread.sleep(5000);



     //Active
     driver.findElement(By.linkText("Active")).click();
     List<WebElement> li2 = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
     assertEquals(li2.size(), 1);
     assertEquals(li2.get(0).getText(), "Moz");
     Thread.sleep(5000);


     //Completed
     driver.findElement(By.linkText("Completed")).click();
     List<WebElement> li3 = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
     assertEquals(li3.size(), 1);
     assertEquals(li3.get(0).getText(), "Benfff");

     Thread.sleep(5000);
 }

 @Test //clear complpeted
    public void test05() {
     driver.findElement(By.xpath("//button[@class='clear-completed']")).click();
     driver.findElement(By.linkText("All")).click();
     List<WebElement> li4 = driver.findElements(By.xpath("//ul[@class='todo-list']/li"));
     assertEquals(li4.size(), 1);
     assertEquals(li4.get(0).getText(), "Moz");

 }

 @Test // TBD: hover AND REMOVE
    public void test06() {

 }
}
