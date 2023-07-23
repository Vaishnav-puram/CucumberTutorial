package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class OmayoLogin {
    WebDriver driver=null;
    @Given("^I navigate to the omayo website$")
    public void i_navigate_to_the_omayo_website() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        //maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
    public void i_enter_username_as_and_password_as_into_the_fields(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("userid")).sendKeys(username);
        driver.findElement(By.name("pswrd")).sendKeys(password);

    }
    @And("^I click on Login button$")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
    @Then("^User should login based on expected \"([^\"]*)\" status$")
    public void user_should_login_based_on_expected_status(String loginstatus) {
        // Write code here that turns the phrase above into concrete actions
        String expectedResult=loginstatus;
        String actualResult=null;
        try {
            Alert alert=driver.switchTo().alert();
            String text=alert.getText();
            if (text.equals("Error Password or Username")) {
                actualResult = "failure";
            }
        }catch (Exception e){
            actualResult="success";
        }
        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();

    }
}
