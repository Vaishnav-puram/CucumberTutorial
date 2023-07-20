//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LoginPage {
//    protected WebDriver driver;
//    public LoginPage(WebDriver driver){
//        this.driver=driver;
//    }
//   private By txt_username=By.xpath("//input[@id='name']");
//   private By txt_password=By.xpath("//input[@id='password']");
//   private By txt_loginButton=By.xpath("//button[@id='login']");
//
//    public void enterUsername(String username){
//        driver.findElement(txt_username).sendKeys(username);
//    }
//    public void enterPassword(String password){
//        driver.findElement(txt_password).sendKeys(password);
//    }
//    public void clickLogin(){
//        driver.findElement(txt_loginButton).click();
//    }
//    public void logoutDisplayed(){
//        driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
//    }
//    public void maximizeBrowser(){
//        driver.manage().window().maximize();
//    }
//    public void quitBrowser(){
//        driver.quit();
//    }
//}
