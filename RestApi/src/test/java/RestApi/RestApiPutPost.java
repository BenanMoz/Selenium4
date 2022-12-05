package RestApi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Connection;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import org.json.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class RestApiPutPost {

    String baseUrl = "http://localhost:9000";
    public static RequestSpecification request;
    public static Response response;

    @BeforeClass
    public void start() {
        RestAssured.baseURI = baseUrl;
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
    }

    @Test //pust
    public void test01_noCourse() {
        JSONObject params = new JSONObject();
        params.put("firstName", "Yonis");
        params.put("lastName", "Flens");
        params.put("email", "yonip@adis.co.il");
        params.put("programme", "some eng");
        request.body(params.toJSONString());
        response = request.post("/student");
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test//put
    public void test02_all() {
        response = request.get("http://localhost:9000/student/list");
        response.prettyPrint();
        //JsonPath param2 = response.jsonPath();
        JSONObject param3 = new JSONObject();
        param3.put("firstName", "yoyo");
        param3.put("lastName", "olo");
        param3.put("email", "gol@atid.com");
        param3.put("programme", "cc");
        request.body(param3.toJSONString());
        response = request.put("/student/101");

        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void test03_addWithCourses(){
        JSONObject param4 = new JSONObject();
        param4.put("firstName","koko");
        param4.put("lastName", "reko");
        param4.put("email", "kokeReko@gmail.com");
        param4.put("programme", "ccc");
        List<String> list = new ArrayList<String>();
        list.add("math");
        list.add("english");
        list.add("history");
        JSONArray array = new JSONArray();
        for(int i = 0; i < list.size(); i++) {
            array.add(list.get(i));
        }

        param4.put("courses",array);
        request.body(param4.toJSONString());
        response = request.post("/student");
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test //delete
    public void test05() {
     response = request.delete("/student/99");
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 204);
    }
}

