package stepDefenation;

import commonLibrary.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BagSteps extends CommonFunction {

    @Given("I am on homepage {string} with title as {string}")
    public void openHomePage(String url,String expectedPageTile)
    {
     browser.get(url);
     acceptCookies();
     String actualPageTitle=browser.getTitle();
        Assert.assertEquals(expectedPageTile,actualPageTitle);

    }

    @When("I click mens section and summer shop")
    public void selectingsection()
    {
      browser.findElement(By.xpath("//button[@aria-label=\"MENS\"]")).click();
      browser.findElement(By.xpath("//*[@id=\"mens\"]/div/ul/li[5]/a")).click();
    }
    @When("I click particular product")
    public void selectingProduct()
    {
     browser.findElement(By.xpath("//*[@id=\"product-grid\"]/div[2]/section[4]/div/div[1]/div[1]/a/picture/img")).click();
    }





    @Then("I should be on the particular product page with title as {string}")
    public void productPageWithTitle(String expedtedProductPageatitle)
    {
     String actualPageTile= browser.getTitle();
    }
    @When("I click the size as L")
    public void clickSize()
    {
     browser.findElement(By.id("variation-swatch-button-1-34")).click();
    }
    @When("I click the Add to cart")
    public void addingToCart()
    {
     browser.findElement(By.xpath("//span[@class=\"b-product_addtocard-availability\"]")).click();
    }


    @Then("The particular product should add to the cart with notification of {string}")
    public void productAddedConfirmationMgs(String expectedConfirmationMgs)
    {
        String actualConfirmationMgs =browser.findElement(By.xpath("//h2[@data-ref=\"minicartTitle\"]")).getText();
        Assert.assertEquals(expectedConfirmationMgs,actualConfirmationMgs);

    }
}
