package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="name")
    WebElement txt_username;
    @FindBy(id="password")
    WebElement txt_password;
    @FindBy(id="login")
    WebElement txt_loginButton;
    @FindBy(id="logout")
    WebElement txt_logout;

    public void enterUserName(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLogin(){
        txt_loginButton.click();
    }
    public boolean logoutDisplayed(){
        return txt_logout.isDisplayed();
    }
    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }
    public void quitBrowser(){
        driver.quit();
    }


}
