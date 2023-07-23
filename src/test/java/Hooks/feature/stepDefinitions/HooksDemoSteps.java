package Hooks.feature.stepDefinitions;

import PageFactory.LoginPage_PF;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class HooksDemoSteps {

    WebDriver driver=null;
    @Before(order = 1) //Hook
    public void setup(){
        System.out.println("inside browser setup");
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Before(order = 2)
    public void setup2(){
        System.out.println("inside steup2");
    }
    @BeforeStep //executes before every step
    public void beforeSteps(){
        System.out.println("I'm inside before step");
    }
    @AfterStep //executes after every step
    public void afterSteps(){
        System.out.println("I'm inside after step");
    }
    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("browser is open");
        driver.navigate().to("https://example.testproject.io/web/");
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("entering username and password....");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);


    }
    @And("^clicks login button$")
    public void clicks_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicked login button");
        driver.findElement(By.xpath("//button[@id='login']")).click();


    }
    @Then("^user is navigated to home page$")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to test form");
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed());
    }

    @After //Hook
    public void closure(){
        driver.quit();
        System.out.println("browser closed");
    }
}
