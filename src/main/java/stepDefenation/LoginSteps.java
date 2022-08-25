package stepDefenation;

import commonLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lv.Tad;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends CommonFunction {


    @When("I click the signin button")
    public void clickSigninBtm()
        {
            browser.findElement(By.xpath("//*[@id=\"page-head\"]/div[2]/div/div[3]/div/div[4]/div[2]")).click();
          }
@When("I enter email {string} and password {string}")
    public void enteringEmailAndPassword(String invalidEmail, String invalidPassword)
{
browser.findElement(By.id("dwfrm_login_email")).sendKeys(invalidEmail);
browser.findElement(By.id("dwfrm_login_password")).sendKeys(invalidPassword);
}
@When("I click login button")
    public void clickLoginBtm()
{
 browser.findElement(By.xpath("//div[@class=\"b-login_form-actions_group m-dialog_form\"]/div/button[@data-id=\"submitButton\"]")).click();
}
@Then("I should not allowed to login but I should get a message {string}")
    public void invalidLoginMsg(String expectedInvalidLoginMsg)
{
String actualInvalidLoginMsg = browser.findElement(By.xpath("//div[@class=\"b-message-inner\"]/p")).getText();
    Assert.assertEquals(expectedInvalidLoginMsg,actualInvalidLoginMsg);


}

}
