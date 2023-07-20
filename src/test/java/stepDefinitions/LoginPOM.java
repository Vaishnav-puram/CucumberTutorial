package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPOM {
    WebDriver driver=null;
    LoginPage login;
    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("browser is open");
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        login=new LoginPage(driver);
        driver.navigate().to("https://example.testproject.io/web/");
        login.maximizeBrowser();
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("entering username and password....");
        login.enterUsername(username);
        login.enterPassword(password);

    }
    @When("clicks login button")
    public void clicks_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicked login button");
        login.clickLogin();

    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to test form");
        login.logoutDisplayed();
        login.quitBrowser();
    }
}
