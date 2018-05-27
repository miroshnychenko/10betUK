package uk.com.tenbet;

import core.WebDriverTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.tenbet.rootpage.RootPage;

public class RootPageTest extends WebDriverTestBase{

    @Test
    public void verifyElementsPresentOnRootPage() {
        driver.get("https://www.10bet.co.uk/");
        RootPage rootPage = PageFactory.initElements(driver, RootPage.class);
        Assert.assertTrue(rootPage.verifyElementsPresent());
    }
}
