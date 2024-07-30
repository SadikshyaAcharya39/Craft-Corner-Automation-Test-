package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Catch the driver

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods and Locators

    // Login Page
    public By loginUsernameLocator = By.xpath("//input[@placeholder='Username']");
    public By loginPasswordLocator = By.xpath("//input[@placeholder='Password']");
    public By loginButtonLocator = By.xpath("//button[@class='btn']");
}
