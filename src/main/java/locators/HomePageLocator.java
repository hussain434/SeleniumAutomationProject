package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageLocator {

private String SIGNIN= "//div[@class='panel header']//a[contains(text(),'Sign In')]";

private WebDriver driver;

private WebDriverWait wait;

public HomePageLocator (WebDriver driver){

    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));

}

public WebElement getSigninLocator(){

    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGNIN)));
}




}
