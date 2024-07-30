package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage {
    private WebDriver driver;
    private LoginPage loginPage;

    // Catch the driver
    public ShopPage(WebDriver driver, LoginPage loginPage ){
        this.driver = driver;
        this.loginPage = loginPage;
    }

    // Shop Now Button
    public By shopNowButtonLocator = By.xpath("//a[@class='cta-button']");

    // Shop Button
    public By shopButton = By.xpath("//a[@href='shop.html']");

    // Add to Cart Button
    public By addToCartButtonLocator = By.xpath("//a[@class='product']");

    // Buy Now Button
    public By buyNowButtonLocator = By.xpath("//button[@onclick='buyNow()']");

    // Product Price Details
    public By productPriceDetailsLocator = By.xpath("//div[@class='cartcontainer']");

    // CheckOut Button
    public By checkOutButtonLocator = By.xpath("//a[@href='checkout.html']");

}
