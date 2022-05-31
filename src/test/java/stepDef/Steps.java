package stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {
    WebDriver driver= new ChromeDriver();

    @Given("I have to launch google chrome browser")
    public void i_have_to_launch_google_chrome_browser() {
        System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\Gokila\\IdeaProjects\\AmazonProject\\src\\main\\resources\\chromedriver.exe");

        driver.get("https://www.google.com");
    }
    @When("Type amazon in google search bar")
    public void type_amazon_in_google_search_bar() throws InterruptedException {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Amazon");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(3000);


    }
    @Then("click on the first link in results page")
    public void click_on_the_first_link_in_results_page() {
        driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span")).click();
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        driver.quit();


    }

}




