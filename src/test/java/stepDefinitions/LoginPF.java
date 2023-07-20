package stepDefinitions;

import PageFactory.LoginPage_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPF {
    WebDriver driver=null;
    LoginPage_PF login;
    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("browser is open");
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        login=new LoginPage_PF(driver);
        driver.navigate().to("https://example.testproject.io/web/");
        login.maximizeBrowser();
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("entering username and password....");
        login=new LoginPage_PF(driver);
        login.enterUserName(username);
        login.enterPassword(password);

    }
    @When("clicks login button")
    public void clicks_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicked login button");
        login=new LoginPage_PF(driver);
        login.clickLogin();

    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to test form");
        login=new LoginPage_PF(driver);
        login.logoutDisplayed();
        login.quitBrowser();
    }
}
