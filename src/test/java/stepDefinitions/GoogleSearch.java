//package stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.security.Key;
//import java.time.Duration;
//
//public class GoogleSearch {
//    WebDriver driver=null;
//    @Given("browser is open")
//    public void browser_is_open() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open");
//        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//    @Given("user is on google search page")
//    public void user_is_on_google_search_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("user is on search page");
//        driver.navigate().to("https://google.com");
//    }
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("user enter text in search field");
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cucumber tutorial");
//    }
//    @When("hits enter")
//    public void hits_enter() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("hits enter/search button");
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
//    }
//    @Then("user is navigated to search results")
//    public void user_is_navigated_to_search_results() throws InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("search results opened");
//        Thread.sleep(2000);
//        driver.getPageSource().contains("Cucumber Tutorial for Beginners");
//        driver.quit();
//    }
//
//}
