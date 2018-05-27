package uk.com.tenbet;

import core.WebDriverTestBase;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.tenbet.rootpage.RootPage;
import uk.co.tenbet.sharedElemets.LoginForm;

public class LoginFromRootPage extends WebDriverTestBase{

    @Test
    public void loginFromRootPage() {
        String login = "10betcouktest1";
        String password = "qwe123";

        driver.get("https://www.10bet.co.uk/");
        RootPage rootPage = PageFactory.initElements(driver, RootPage.class);
        rootPage.clickLoginButton();

        LoginForm loginForm = PageFactory.initElements(driver, LoginForm.class);
        loginForm.typeLogin(login);
        loginForm.typePassword(password);
        loginForm.clickLoginButton();
        wait.until(ExpectedConditions.urlContains("/sports/"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.10bet.co.uk/sports/"));

    }
}
