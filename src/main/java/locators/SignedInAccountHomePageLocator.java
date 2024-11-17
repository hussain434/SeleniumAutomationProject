package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignedInAccountHomePageLocator {

    private String DROPDOWN = "div[class='panel header'] button[type='button']";
    private String SIGNOUT  = "div[aria-hidden='false'] li[data-label='or'] a";
    private WebDriver driver;

    private WebDriverWait wait;

    public SignedInAccountHomePageLocator(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    public WebElement getDropDrownLocator(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(DROPDOWN)));
    }

    public WebElement getSignoutbuttonLocator(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SIGNOUT)));

    }
}
