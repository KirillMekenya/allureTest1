import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClassTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "C:\\Kirill_Senla\\java_training\\maven_project\\driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://wbl12dev05.bt.bpc.in:23004/mp-web-client/login/");
        driver.findElement(By.cssSelector("#details-button")).click();
        WebElement linkProceed = driver.findElement(By.linkText("Proceed to wbl12dev05.bt.bpc.in (unsafe)"));
        linkProceed.click();
        loginPage = new LoginPage(driver);
    }

    @After
    public void driverClose() {
        driver.quit();
    }
    @Test
    public void test1 () {
        MainPage mainPage = loginPage.auth("admin", "admin");
        Assert.assertNotNull(mainPage.findTransactionMenu());

    }
}
