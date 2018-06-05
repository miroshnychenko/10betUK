package uk.com.tenbet;

import core.WebDriverTestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.tenbet.TenBetUKSite;

public class LoginFromRootPage extends WebDriverTestBase{

    @Test
    public void loginFromRootPage() {
        String login = "10betcouktest1";
        String password = "qwe123";

        driver.get("https://www.10bet.co.uk/");
        TenBetUKSite site = new TenBetUKSite(driver);

        site.rootPage().clickLoginButton();
        site.loginForm().typeLogin(login);
        site.loginForm().typePassword(password);
        site.loginForm().clickLoginButton();
        wait.until(ExpectedConditions.urlContains("/sports/"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.10bet.co.uk/sports/"));

    }
}
