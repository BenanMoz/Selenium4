package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PageForm {

    @FindBy(how = How.CSS , using = "input[name='name']")
    private WebElement occup;

    @FindBy(id = "age" )
    private WebElement age;

    @FindBy (id = "location")
    private WebElement location;

    @FindBy (how = How.XPATH , using = "//input[@value='Click Me']")
    private WebElement click_me;

     public void fillForm(String occup1, String age1, String location1)
     {
         occup.sendKeys(occup1);
         age.sendKeys(age1);
         location.sendKeys(location1);
         click_me.click();
     }
     public void AssertClickIsDisplayed()
     {
         Assert.assertTrue(this.click_me.isDisplayed());

     }
}
