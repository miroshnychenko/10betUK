package uk.co.tenbet.elemets;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationsPopup extends AbstractPage{

    @FindBy (how = How.ID, using = "webpush-custom-prompt-button1")
    private WebElement doNotAllowButton;

    public PushNotificationsPopup(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickDoNotAllow() {
        doNotAllowButton.click();
    }
}
