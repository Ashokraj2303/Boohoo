package commonLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunction {
    public static WebDriver browser;

    public void openBrowse()
    {
        WebDriverManager.chromedriver().setup();
        browser =new ChromeDriver();
    }
    public void closeBrowser()
    {
     browser.quit();
    }
    public void acceptCookies()
    {
        WebDriverWait wait =new WebDriverWait(browser,10);
        wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.xpath("//*[@id=\"consent-dialog\"]/section/div[1]/div[2]/button[1]")))).click();
    }
}
