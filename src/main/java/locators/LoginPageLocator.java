package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageLocator {


    private String EMAIL = "#email";
    private String PASSWORD = "login[password]";
    private String SIGNINBUTTON="fieldset[class='fieldset login'] div[class='primary'] span";
    private WebDriver driver;

    private WebDriverWait wait;

    public LoginPageLocator(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    }

    public WebElement getEmailLocator(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(EMAIL)));
    }

    public WebElement getPasswordLocator(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(PASSWORD)));
    }

    public WebElement getSignInButtom(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(SIGNINBUTTON)));
    }




}
