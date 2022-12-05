package sikuliandDatadriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;





public class GoogleMapsSikuli {

    WebDriver driver;
    Screen sc;
    String path = "/Users/bmzalbat/Desktop";

    @BeforeClass
    public void start() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/maps");
        Thread.sleep(2000);
        sc = new Screen();
    }

    @Test
    public void Test01() throws FindFailed{
        sc.click(path + "f.png");
        sc.click(path + "Screen2.png");
       sc.type(path + "screenFind.png", "London");

    }
}




