package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.SignedInAccountHomePageLocator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignedInHomepageSteps {

    private SignedInAccountHomePageLocator dropdownLocator;
    private SignedInAccountHomePageLocator signoutLocator;
    private WebDriverHook webDriverHook;
    private WebDriverWait wait;

    public SignedInHomepageSteps(){

        webDriverHook = WebDriverHook.getInstance();
        dropdownLocator = new SignedInAccountHomePageLocator(webDriverHook.getDriver());
        signoutLocator = new SignedInAccountHomePageLocator(webDriverHook.getDriver());
        this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(60));
    }

    @And("user clicks on dropdown button")
    public void userClicksonDropdown(){

        dropdownLocator.getDropDrownLocator().click();
    }

    @And("user click on Signout button")
    public void userClicksonSignoutButton(){

        signoutLocator.getSignoutbuttonLocator().click();
    }

    @Then("user should see logout message {string}")
    public void theUserShouldSeeLogoutTheMessage(String expectedMessage) {

        // Find an element and get its text
        String elementText = webDriverHook.getDriver().findElement(By.cssSelector(".base")).getText();

        // Assert that the text of the element is as expected
        Assert.assertEquals(elementText, "You are signed out");

    }


}
