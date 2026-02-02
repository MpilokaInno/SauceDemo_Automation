package pageobjects;

import org.openqa.selenium.By;

public class SauceObjects {

    //Login Page Locators
    public static final By LoginPage = By.cssSelector("#root > div > div.login_logo");
    public static final By Username = By.id("user-name");
    public static final By Password = By.id("password");
    public static final By Login_btn = By.id("login-button");

    //Add to cart Locators
    public static final By addBikeLight = By.id("add-to-cart-sauce-labs-backpack");
    public static final By addTShirt = By.id("add-to-cart-sauce-labs-bike-light");
    public static final By cartIcon = By.id("shopping_cart_container");

    //Checkout Locaters
    public static final By Checkout = By.id("checkout");
    public static final By firstName = By.id("first-name");
    public static final By lastName = By.id("last-name");
    public static final By postalCode = By.id("postal-code");
    public static final By continueBtn = By.id("continue");
    public static final By finishBtn = By.id("finish");
    public static final By checkOutMsg = By.id("checkout_complete_container");
    public static final By cartItemNames = By.className("inventory_item_name");

}
