package Saucedemo.cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout_process {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User is logged in and has items in the cart")
    public void User_login_item_cart(){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @When("User goes to the cart and proceeds to checkout")
    public void User_proceeds_checkout() {
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
    }

    @Then("User completely fill shipping fields")
    public void User_completely_shipping_fields() {
        driver.findElement(By.id("first-name")).sendKeys("Tom");
        driver.findElement(By.id("last-name")).sendKeys("Ibnu");
        driver.findElement(By.id("postal-code")).sendKeys("123");
        driver.findElement(By.id("continue")).click();
    }
}