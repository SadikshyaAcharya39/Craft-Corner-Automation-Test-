package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver){
      this.driver = driver;
    }

    public void windowSwitching(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.equals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    // Locators

    public By registerLinkedText = By.xpath("//a[@href='register.html']");
    public By registerUsernameLocator = By.xpath("//input[@placeholder='Username']");
    public By registerPasswordLocator = By.xpath("//input[@placeholder='Password']");
    public By registerConfirmPasswordLocator = By.xpath("//input[@placeholder='Confirm Password']");
    public By registerButton = By.xpath("//button[@class='btn']");
    public By loginButton = By.xpath("//a[@href='login.html']");


}
