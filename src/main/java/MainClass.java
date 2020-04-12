import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main (String[] args) {

       /* System.setProperty("webdriver.chrome.driver", "C:\\Kirill_Senla\\java training\\maven project\\driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://wbl12dev05.bt.bpc.in:23004/mp-web-client/login/");
        driver.manage().window().maximize();
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        driver.findElement(By.cssSelector("#details-button")).click();
        WebElement linkProceed = driver.findElement(By.linkText("Proceed to wbl12dev05.bt.bpc.in (unsafe)"));
        linkProceed.click();
        WebElement
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']/span/span"));
        System.out.println("Text is "+loginButton.getText());
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputLogin.sendKeys("admin");
        System.out.println(inputLogin.getAttribute("value"));
        inputPassword.sendKeys("admin");
        loginButton.click();
        WebElement transactionsMenu = driver.findElement(By.xpath("//span[text()='Transactions']"));
        transactionsMenu.click();
        WebElement searchTransactionButton = driver.findElement(By.xpath("//ul[@class='nav metismenu']/li[4]//a[@routerlinkactive='active']"));
        searchTransactionButton.click();
        WebElement configureSearchFieldsButton = driver.findElement(By.xpath("//button[@title='Edit parameters list']"));
        configureSearchFieldsButton.click();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        Iterator<WebElement> iterator = checkboxes.iterator();
        //wait.until(ExpectedConditions.elementToBeSelected())

        WebElement checkboxMerchAcc = driver.findElement(By.xpath("//span[text()='Merchant account']/preceding-sibling::input"));


        if(!checkboxMerchAcc.isSelected())
        {checkboxMerchAcc.click();

            checkboxMerchAcc.click();}



        WebElement checkboxMerchStatus = driver.findElement(By.xpath("//span[text()='Merchant status']/preceding-sibling::input"));
        if(!checkboxMerchStatus.isSelected())
        {checkboxMerchStatus.click();
        checkboxMerchStatus.click();}
        WebElement cancelButton = driver.findElement(By.xpath("//span[text()='Cancel']"));
        cancelButton.click();/*/





       // driver.quit();

    }
}
