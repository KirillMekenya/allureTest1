import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputLogin = By.xpath("//*[@id='username']123");
    private By loginButton = By.xpath("//button[@type='submit']/span/span");
    private By inputPassword = By.xpath("//*[@id='password']");

    public MainPage clickLoginButton () {
        driver.findElement(loginButton).click();
        return new MainPage(driver);
    }

    public LoginPage typeUserName (String username) {
        driver.findElement(inputLogin).sendKeys(username);
        return this;
    }

    public LoginPage typePassword (String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public MainPage auth (String username, String password) {
        this.typeUserName(username);
        this.typePassword(password);
        this.clickLoginButton();
        return new MainPage(driver);
    }

}
