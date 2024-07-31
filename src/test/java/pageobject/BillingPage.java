package pageobject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillingPage {
    private WebDriver driver;

    public BillingPage(WebDriver driver){
        this.driver = driver;
    }

    public By billingDetailsTextLocator = By.xpath("//h2[text()='Billing Details']");
    public By firstNameLocator = By.xpath("//input[@name='first-name']");
    public By lastNameLocator = By.xpath("//input[@name='last-name']");
    public By countryLocator = By.xpath("//input[@name='county-region']");
    public By streetAddressLocator = By.xpath("//input[@name='street-address']");
    public By townCityLocator = By.xpath("//input[@name='town-city']");
    public By provinceLocator = By.xpath("//input[@name='province']");
    public By zipCodeLocator = By.name("zip-code");
    public By emailAddressLocator = By.id("email-address");

    // CheckOut Button
    public By checkOutButtonLocator = By.xpath("//a[@class='cta-button']");

    // Check Field
    public By checkFieldEsewaLocator = By.id("esewa-checkbox");

    // Locate Check boxes
    public By checkBoxLocator = By.cssSelector("input[type='checkbox']");

    public void billingPageFunctionality(){
        WebElement billingDetailsText = driver.findElement(billingDetailsTextLocator);
        Assertions.assertEquals("Billing Details", billingDetailsText.getText().trim(), " Test Failed...");
        WebElement firstName = driver.findElement(firstNameLocator);
        firstName.sendKeys("Sadikshya");
        WebElement lastName = driver.findElement(lastNameLocator);
        lastName.sendKeys("Acharya");
        WebElement country = driver.findElement(countryLocator);
        country.sendKeys("Nepal");
        WebElement streetAddress = driver.findElement(streetAddressLocator);
        streetAddress.sendKeys("Godawari");
        WebElement townCity = driver.findElement(townCityLocator);
        townCity.sendKeys("Lalitpur");
        WebElement province = driver.findElement(provinceLocator);
        province.sendKeys("Bagmati");
        WebElement zipCode = driver.findElement(zipCodeLocator);
        zipCode.sendKeys("44700");
        WebElement emailAddress = driver.findElement(emailAddressLocator);
        emailAddress.sendKeys("Taukhel");

    }

    public void driverWait(){
        // Wait for and handle the alert
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertMessage = alert.getText();
            System.out.println("Alert Message: " + alertMessage);

            // Handle the alert
            alert.accept();

            // Optionally check for further actions or validations
            // For example: Assertions or other verifications after alert handling

        } catch (TimeoutException e) {
            System.out.println("Alert did not appear within the timeout.");
            Assertions.fail("Alert did not appear within the expected time.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            Assertions.fail("An unexpected error occurred: " + e.getMessage());
        }
    }
}
