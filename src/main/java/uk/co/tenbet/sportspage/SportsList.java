package uk.co.tenbet.sportspage;

import core.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SportsList extends AbstractPage {

    public SportsList(WebDriver driver) {
        super(driver);
    }

    public void selectSportFromList(String sport) {
        List<WebElement> sportsList = driver.findElements(By.cssSelector(".sports-list a"));
        for (WebElement element : sportsList) {
            if (element.getText().equals(sport)) {
                element.click();
            }
        }
    }

}
