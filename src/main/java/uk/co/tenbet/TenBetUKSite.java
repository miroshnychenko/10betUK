package uk.co.tenbet;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import uk.co.tenbet.elemets.*;
import uk.co.tenbet.rootpage.RootPage;
import uk.co.tenbet.sportspage.LiveSummaryBlock;
import uk.co.tenbet.sportspage.SportsList;

public class TenBetUKSite extends AbstractPage {

    public TenBetUKSite(WebDriver driver) {
        super(driver);
    }

    public RootPage rootPage() {
        return new RootPage(driver);
    }

    public LoginForm loginForm() {
        return new LoginForm(driver);
    }

    public SportsList sportsList() {
        return new SportsList(driver);
    }

    public LiveSummaryBlock liveSummaryBlock() {
        return new LiveSummaryBlock(driver);
    }

    public BetSlip betSlip() {
        return new BetSlip(driver);
    }

    public Header header() {
        return new Header(driver);
    }

    public RealityCheckPopup realityCheckPopup() {
        return new RealityCheckPopup(driver);
    }

    public PushNotificationsPopup pushNotificationsPopup() {
        return new PushNotificationsPopup(driver);
    }

}
