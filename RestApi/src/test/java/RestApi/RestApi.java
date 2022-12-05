package RestApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Connection;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class RestApi {

    public static RequestSpecification httpRequest;
    public Response response;
    String url = "http://api.openweathermap.org/data/2.5/weather" ;

 @BeforeClass
 public void start() {
     RestAssured.baseURI = url;
     httpRequest = RestAssured.given();
 }
@Test
    public void test01() {
     response = httpRequest.get("?units=metric&q=" + "Haifa" + "&appid=" + "df16464b992edcb5224c614458dee847" );
     //response.prettyPrint();
   // System.out.println(response.contentType());
   // System.out.println(response.statusLine());
   // System.out.println(response.getTime());
   // System.out.println(response.timeIn(TimeUnit.MILLISECONDS));
    Assert.assertEquals(response.contentType(), "Json");

}}
