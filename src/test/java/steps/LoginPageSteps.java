package steps;

import core.WebDriverHook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import locators.HomePageLocator;
import locators.LoginPageLocator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class LoginPageSteps {

    private LoginPageLocator emailLocator;
    private LoginPageLocator passwordLocator;
    private LoginPageLocator signinLocator;
    private WebDriverHook webDriverHook;
    private WebDriverWait wait;

    public LoginPageSteps(){

        webDriverHook = WebDriverHook.getInstance();
        emailLocator = new LoginPageLocator(webDriverHook.getDriver());
        passwordLocator = new LoginPageLocator(webDriverHook.getDriver());
        signinLocator = new LoginPageLocator(webDriverHook.getDriver());
        this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(60));
    }

    @And("user enters email")
    public void enterUserName(){
        emailLocator.getEmailLocator().sendKeys("hussainmustafa712@gmail.com");
    }

    @And("user enters password")
    public void enterPassword(){
        passwordLocator.getPasswordLocator().sendKeys("hussain@1");
    }

    @And("user clicks on signin button")
    public void clickOnSignInButton(){
        signinLocator.getSignInButtom().click();
    }

    @Then("user should see message {string}")
    public void theUserShouldSeeTheMessage(String expectedMessage) {

        // Find an element and get its text
        String elementText = webDriverHook.getDriver().findElement(By.cssSelector(".base")).getText();

        // Assert that the text of the element is as expected
        Assert.assertEquals(elementText, "Home Page");

    }
    }




