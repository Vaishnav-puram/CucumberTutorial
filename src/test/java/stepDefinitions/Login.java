package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {
    WebDriver driver=null;
    @Given("browser is open")
    public void browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("browser is open");
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://example.testproject.io/web/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username,String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("entering username and password....");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }
    @When("clicks login button")
    public void clicks_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicked login button");
        driver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(2000);
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to test form");
        driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
        driver.quit();
    }
}
