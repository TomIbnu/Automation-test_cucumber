package Saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_process {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("User in login page")
    public void User_in_login_page() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name"));
        driver.findElement(By.id("password"));
    }

    @When("Input username")
    public void inputUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("Input password")
    public void inputPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("click login button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("User in home page")
    public void userInHomePage() {
        driver.findElement(By.id("shopping_cart_container"));
    }

    @And("Input invalid password login")
    public void inputInvalidPasswordLogin() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name"));
        driver.findElement(By.id("password"));
        driver.findElement(By.id("user-name")).sendKeys("Tom_Ibnu");
        driver.findElement(By.id("password")).sendKeys("tom123");
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.className("error-button"));
    }
}