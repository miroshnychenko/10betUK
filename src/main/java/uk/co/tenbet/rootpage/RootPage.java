package uk.co.tenbet.rootpage;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RootPage extends AbstractPage {

    @FindBy(how = How.CLASS_NAME, using = "root-header")
    private WebElement logo;

    @FindBy(how = How.CLASS_NAME, using = "root-login-btn")
    private WebElement loginButton;

    @FindBy(how = How.CSS, using = ".custom-slider-active .sport-item .big-btn")
    private WebElement joinNowSports;

    @FindBy(how = How.CLASS_NAME, using = "root-footer")
    private WebElement footer;

    public RootPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickJoinNowSportsButton() {
        joinNowSports.click();
    }

    public boolean verifyElementsPresent() {
        return logo.isDisplayed() && loginButton.isDisplayed() && joinNowSports.isDisplayed() && footer.isDisplayed();
    }

}
