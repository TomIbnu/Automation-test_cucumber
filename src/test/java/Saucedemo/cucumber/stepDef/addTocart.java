package Saucedemo.cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addTocart {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User is log in")
    public void User_is_log_in(){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("User adds an item to the cart")
    public void User_add_item_to_cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("User should see the item in your cart")
    public void userShouldSeeTheItemInYourCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("cart_quantity"));
    }
}
