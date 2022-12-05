package RestApi;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ChuckNorris {

    public static RequestSpecification httpRequest;
    public Response response;
    String url = "https://api.chucknorris.io/jokes/random";


    @BeforeClass
    public void start() {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();
    }

    @Test // base
    public void test01() {
        response = httpRequest.get(url);
        response.prettyPrint();
    }

    @Test //using category
    public void test02() {
        response = httpRequest.get("?category=history");
        response.prettyPrint();
    }

    @Test // all categories
    public void test03() {
        response = httpRequest.get("https://api.chucknorris.io/jokes/categories");
        response.prettyPrint();
    }

    @Test(enabled = false)// check free text
    public void test04() {
        response = httpRequest.get("search?query=" + "Barack Obama");
        //response.prettyPrint();
        JsonPath je = response.jsonPath();
        int ccObama = je.get("total");
        System.out.println(ccObama);
    }
    @Test
    public void test05() {
        response = httpRequest.get("search?query=" + "Charlie Sheen");
        JsonPath je2 = response.jsonPath();
        int Charlie = je2.get("total");
        System.out.println(Charlie);
    }

    @Test
    public void test07() {
        response = httpRequest.get("?category=movie");
       // response.prettyPrint();
        JsonPath je3 = response.jsonPath();
        String urlo = je3.get("url");
        String value = je3.getString("value");
       // System.out.println(urlo);
        System.out.println(value);

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(urlo);

        WebElement ele5 = driver.findElement(By.xpath("//P[@id='joke_value']"));
        String ser = ele5.getText();
        System.out.println(ser);
        Assert.assertEquals(value,ser);

    }





}





