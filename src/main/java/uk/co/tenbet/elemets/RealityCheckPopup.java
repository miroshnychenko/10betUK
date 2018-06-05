package uk.co.tenbet.elemets;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RealityCheckPopup extends AbstractPage {

    @FindBy(how = How.CSS, using = ".c-reality-check .popupClose")
    private WebElement closeButton;


    public RealityCheckPopup(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickCloseButton() {
        closeButton.click();
    }
}
