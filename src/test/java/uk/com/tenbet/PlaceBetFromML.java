package uk.com.tenbet;

import core.WebDriverTestBase;
import org.testng.annotations.Test;
import uk.co.tenbet.TenBetUKSite;

public class PlaceBetFromML extends WebDriverTestBase {

    @Test
    public void placeBetFromML() {
        String login = "10betcouktest1";
        String password = "qwe123";

        driver.get("https://www.10bet.co.uk/");
        TenBetUKSite site = new TenBetUKSite(driver);
        site.rootPage().clickOnLogo();
        site.header().clickLoginButton();
        site.pushNotificationsPopup().clickDoNotAllow();
        site.loginForm().doLogin(login, password);
        site.realityCheckPopup().clickCloseButton();
        site.liveSummaryBlock().clickOnBetButton();
        site.betSlip().isBetslipItemPresent();
        site.betSlip().enterStake();
        site.betSlip().clickPlaceBetButton();
    }
}
