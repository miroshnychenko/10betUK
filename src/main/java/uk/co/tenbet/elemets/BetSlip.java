package uk.co.tenbet.elemets;

import core.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BetSlip extends AbstractPage {

    public BetSlip(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isBetslipItemPresent() {
        WebElement betslipItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("betSlip-bets-item")));
        return betslipItem.isDisplayed();
    }

    public void enterStake() {
        WebElement stakeBoxInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("stakebox")));
        stakeBoxInput.sendKeys("1");
    }

    public void clickPlaceBetButton() {
        WebElement placeBetButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PlaceBetButton")));
        placeBetButton.click();
    }
}
