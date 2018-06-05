package uk.co.tenbet.elemets;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginForm extends AbstractPage {

    @FindBy(how = How.CSS, using = "input[data-uat=\"login-username-input\"]")
    WebElement loginInput;

    @FindBy(how = How.CSS, using = "input[data-uat=\"login-password-input\"]")
    WebElement passwordInput;

    @FindBy(how = How.ID, using = "Center_LoginResponsiveBlock_43771-submit-button")
    WebElement loginButton;


    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void typeLogin(String login) {
        loginInput.clear();
        loginInput.sendKeys(login);
    }

    public void typePassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void doLogin(String login, String password) {
        typeLogin(login);
        typePassword(password);
        clickLoginButton();
    }
}
