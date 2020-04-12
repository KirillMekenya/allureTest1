import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private By transactionMenu = By.xpath("//span[text()='Transactions']");

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }
    public MainPage findTransactionMenu () {
        this.driver.findElement(transactionMenu);
        return this;
    }

}
