package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagee {
    @FindBy(name = "username2")
    private WebElement txt_username;

    @FindBy(name = "password2")
    private WebElement txt_password;

    @FindBy(id = "submit")
    private WebElement submit;

    public void loginaction(String user, String pass) {
        txt_username.sendKeys(user);
        txt_password.sendKeys(pass);
        submit.click();
    }}