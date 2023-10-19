package Saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Payment_process {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User goes to the cart page  and goes to checkout")
    public void User_to_cartpage_and_checkout(){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
    }

    @When("User fill all shipping fields")
    public void User_fill_all_fields() {
        driver.findElement(By.id("first-name")).sendKeys("Tom");
        driver.findElement(By.id("last-name")).sendKeys("Ibnu");
        driver.findElement(By.id("postal-code")).sendKeys("123");
        driver.findElement(By.id("continue")).click();
    }

    @And("User want to pay checkout item")
    public void User_want_pay_item() {
        driver.findElement(By.id("finish")).click();
    }
    @Then("User finish the payment")
    public void User_finish_payment() {
        driver.findElement(By.id("back-to-products")).click();
    }
}