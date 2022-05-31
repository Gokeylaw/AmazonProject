package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepsTwo{
    WebDriver driver= new ChromeDriver();
    @Given("^I have to launch amazon website$")
    public void i_have_to_launch_amazon_website()  {
        driver.get("https://www.amazon.in");
        WebElement logo= driver.findElement(By.cssSelector("#nav-logo-sprites"));
       String ActualName = logo.getAttribute("aria-label");
       String ExpectedName= "Amazon";
       assertEquals(ActualName,ExpectedName);
       //driver.quit();

    }

    @When("^Enter userid and password$")
    public void enter_userid_and_password() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        WebElement login = driver.findElement(By.name("email"));
        login.sendKeys("8778702185");
        driver.findElement(By.id("continue")).click();
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Sangoki1204@");
        pass.sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]")).click();
    }

    @Then("^Verify page is landed at home page$")
    public void verify_page_is_landed_at_home_page() {
        WebElement title= driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        String ActualTitle= title.getText();
        String ExpectedTitle = "Hello, Gokila";
        assertEquals(ActualTitle,ExpectedTitle);
        //System.out.println(title.getText());
        driver.quit();


    }



}
