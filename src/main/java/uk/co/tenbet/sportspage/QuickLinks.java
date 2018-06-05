package uk.co.tenbet.sportspage;

import core.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuickLinks extends AbstractPage {


    public QuickLinks(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
