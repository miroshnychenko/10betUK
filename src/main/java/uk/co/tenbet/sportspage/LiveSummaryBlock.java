package uk.co.tenbet.sportspage;

import core.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class LiveSummaryBlock extends AbstractPage {
    private List<WebElement> betButtonsList;

    public LiveSummaryBlock(WebDriver driver) {
        super(driver);
    }

    public void clickOnBetButton() {
        betButtonsList = driver.findElements(By.cssSelector(".event-live .bet-button"));
        for (WebElement element : betButtonsList) {
            if (!element.getAttribute("class").contains("phantom")) {
                element.click();
                break;
            }
        }
    }
}
