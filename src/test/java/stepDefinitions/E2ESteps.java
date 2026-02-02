package stepDefinitions;


import accelerators.Base;
import accelerators.actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.SauceObjects;
import utility.Utils;

import java.util.List;

public class E2ESteps {
    WebDriver driver;


    @Given("The user navigates to the SauceDemo login page")
    public void theUserNavigatesToTheSauceDemoLoginPage() throws Exception {
        actions.isElementVisible(SauceObjects.LoginPage, "Logo");
    }

    @When("The user logs in with valid credentials")
    public void theUserLogInWithValidCredentials() throws Exception {
        actions.typeInTextBox(SauceObjects.Username, Utils.ConfigReader.getProperty("username"),"Username");
        actions.typeInTextBox(SauceObjects.Password, Utils.ConfigReader.getProperty("password"), "Password");
        actions.clickOnElement(SauceObjects.Login_btn, "Login_button");
    }
    @And("Adds two items to the cart")
    public void addsTwoItemsToTheCart() throws Exception{
        actions.waitForElementToBeVisible(SauceObjects.addBikeLight, 10);
        actions.clickOnElement(SauceObjects.addBikeLight, "Bike Light");
        actions.clickOnElement(SauceObjects.addTShirt, "Bolt T-Shirt");
    }
    @And("Views the cart and verifies the items")
    public void viewsTheCartAndVerifiesTheItems() throws Exception{
        actions.clickOnElement(SauceObjects.cartIcon,"goToCart");
        List<WebElement> itemNames = Base.driver.findElements(SauceObjects.cartItemNames);

        boolean backPackFound = false;
        boolean bikeLightFound = false;

        for (WebElement item : itemNames) {
            String itemName = item.getText();

            if (itemName.equalsIgnoreCase("Sauce Labs Backpack")) {
                backPackFound = true;
            }
            if (itemName.equalsIgnoreCase("Sauce Labs Bike Light")) {
                bikeLightFound = true;
            }
        }
        Assert.assertTrue("Back is in the cart", backPackFound);
        Assert.assertTrue("Bike Light is in the cart", bikeLightFound);
    }

    @And("proceeds to checkout")
    public void proceedsToCheckout() throws InterruptedException {
        actions.clickOnElement(SauceObjects.Checkout, "Checkout");
        Thread.sleep(4000);
    }

    @And("fills in checkout information")
    public void fillsInCheckoutInformation() throws InterruptedException {
        actions.typeInTextBox(SauceObjects.firstName,  Utils.ConfigReader.getProperty("firstName"),"firstName");
        actions.typeInTextBox(SauceObjects.lastName,  Utils.ConfigReader.getProperty("lastName"),"laststName");
        actions.typeInTextBox(SauceObjects.postalCode,  Utils.ConfigReader.getProperty("postalCode"),"postalCode");
        actions.clickOnElement(SauceObjects.continueBtn, "continueBtn");
    }

    @And("completes the purchase")
    public void completesThePurchase() throws InterruptedException {
        actions.clickOnElement(SauceObjects.finishBtn, "finishBtn");
        Thread.sleep(3000);
    }

    @Then("the user should see the {string} confirmation message")
    public void theUserShouldSeeTheConfirmationMassage(String Massage){
        actions.waitForElementToBeVisible(SauceObjects.checkOutMsg, 5);
        WebElement element = Base.driver.findElement(SauceObjects.checkOutMsg);
        String actualMsg = element.getText();
        actions.CompareValues(actualMsg, Massage, "productVisibility");
    }
}