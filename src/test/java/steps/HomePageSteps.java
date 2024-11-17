package steps;

import core.WebDriverHook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import locators.HomePageLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageSteps {

    private HomePageLocator signinlocator;
    private WebDriverHook webDriverHook;
    private WebDriverWait wait;


    public HomePageSteps(){

        webDriverHook = WebDriverHook.getInstance();
        signinlocator = new HomePageLocator(webDriverHook.getDriver());
        this.wait = new WebDriverWait(webDriverHook.getDriver(), Duration.ofSeconds(60));
    }

    @Given("user is on login page")
    public void goToEcommerceApp(){
        signinlocator=new HomePageLocator(webDriverHook.getDriver());
    }

    @When("user click on Signin button")
    public void clickOnSigninButton(){
        signinlocator.getSigninLocator().click();
    }

}
