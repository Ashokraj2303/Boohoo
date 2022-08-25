package stepDefenation;

import commonLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchSteps  extends CommonFunction {

@When("I click search box")
    public void clickSearchBox()
{browser.findElement(By.xpath("//div[@class=\"b-search_input-wrapper\"]")).click();

}
@When("I type {string} in search box")
    public void typeProductName(String productType)
{
browser.findElement(By.xpath("//div[@class=\"b-search_input-wrapper\"]")).sendKeys(productType);
}
@When("I click the search icon")
    public void clickSearchIcon()
{
    browser.findElement(By.xpath("//button[@class=\"b-search_input-close\"]")).click();

}
@Then("I should only get result as per my search")
    public void resultPage()
{

}


}

