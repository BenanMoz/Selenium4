package LocatorsPackage;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculateBmi2withAllure {
    WebDriver driver;

    @BeforeClass
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://atidcollege.co.il/Xamples/bmi/");


    }

    @Test (description = "Login to bmi")
    public void test01() {
        loginbbAllure();

        WebElement res = driver.findElement(By.id("bmi_result"));
        String val = res.getAttribute("value");
        System.out.println(val);
        assertEquals(val, "690", "sorry");
    }

    @Step ("login with allure")
    public void loginbbAllure() {
        WebElement weight = driver.findElement(By.id("weight"));
        weight.sendKeys("100");
        WebElement height = driver.findElement(By.cssSelector("#hight"));
        height.sendKeys("120");
        WebElement fe = driver.findElements(By.cssSelector("input[class='button']")).get(0);
        fe.click();
    }
    
    @Test (enabled = false)
    public void test02() {
        WebElement fe = driver.findElements(By.cssSelector("input[class='button']")).get(0);
        System.out.println(fe.getSize());
        System.out.println(fe.getLocation());
        boolean be1 = fe.isEnabled();
        boolean be2 = fe.isDisplayed();
        boolean be3 = fe.isSelected();
        assertTrue(be1);
        assertTrue(be2);
        assertFalse(be3);



        String typeOfTag = fe.getTagName();
        assertEquals(typeOfTag, "input");
        String texto = fe.getAttribute("value");
        System.out.println(texto);
        assertEquals(texto, "Calculate BMI", "noSame");
        assertFalse(driver.findElement(By.id("new_input")).isDisplayed(),"Checking Element (new_input) is Displayed");

    }





    @AfterClass
    public void end() {
        driver.quit();
    }
}









