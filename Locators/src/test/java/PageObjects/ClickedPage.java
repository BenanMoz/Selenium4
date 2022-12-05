package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClickedPage {

@FindBy (how = How.XPATH , using = "//button[@type='button']")
    private WebElement clickMe;


public void clickMe() {
    clickMe.click();
}
}
