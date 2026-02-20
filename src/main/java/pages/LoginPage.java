package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private final WebDriver driver;

    // ---------- Locators ----------
    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginBtn      = By.tagName("button");
   // private By errorMsg      = By.cssSelector("div.error-msg");

    // ---------- Constructor ----------
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // ---------- Page Actions ----------
    public void enterUsername(String username) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
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