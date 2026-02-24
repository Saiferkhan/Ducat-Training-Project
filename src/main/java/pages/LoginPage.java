package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    private final WebDriver driver;

    // ---------- Locators ----------
      
    @FindBy(name="username")
    WebElement userInput;
    
    @FindBy(name="password")
    WebElement passwordInput;
    
    @FindBy(tagName="button")
    WebElement loginbtn;
    
    // ---------- Constructor ----------
    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // ---------- Page Actions ----------
    public void enterUsername(String username) {
        userInput.clear();
        userInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginbtn.click();
    }

    //public String getErrorMessage() {
       // return driver.findElement(errorMsg).getText();

   // }

    // Fluent login method
    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}