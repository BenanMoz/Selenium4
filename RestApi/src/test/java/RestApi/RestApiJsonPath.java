package RestApi;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RestApiJsonPath {

    public static RequestSpecification httpRequest;
    public Response response;
    String url = "http://api.openweathermap.org/data/2.5/weather";
    WebDriver driver;

    @BeforeClass
    public void start() {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();
    }

    @Test
    public void test01() {
        response = httpRequest.get("?units=metric&q=" + "Jerusalem" + "&appid=" + "df16464b992edcb5224c614458dee847");
        //response.prettyPrint();
        JsonPath jeson = response.jsonPath();
        String coun = jeson.get("sys.country");
        System.out.println(coun);
        Assert.assertEquals(coun, "IL");
    }

    @Test
    public void test02() throws Exception {
        response = httpRequest.get("?units=metric&q=" + "Jerusalem" + "&appid=" + "df16464b992edcb5224c614458dee847");
        response.prettyPrint();
        JsonPath jeson2 = response.jsonPath();
        int humedity = jeson2.get("main.humidity");
        System.out.println(humedity);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openweathermap.org/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys("Jerusalem, IL");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='search-dropdown-menu']/li[1]")).click();
        String g = driver.findElement(By.xpath("//ul[@class='weather-items text-container orange-side standard-padding']/li[3]")).getText();
        System.out.println(g);
        String[] arr = g.split(":");
        // System.out.println(arr[1]);
        String[] arr2 = arr[1].split("%");
        System.out.println(arr2[0]);
    }
}




