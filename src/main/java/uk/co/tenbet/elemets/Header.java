package uk.co.tenbet.elemets;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Header extends AbstractPage {

    @FindBy (how = How.CSS, using = "a[title=\"Login\"]")
    private WebElement loginButton;


    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
