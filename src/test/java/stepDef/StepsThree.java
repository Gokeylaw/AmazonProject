package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class StepsThree {
    WebDriver driver = new ChromeDriver();
    @Given("At welcome page scroll down to end")
    public void at_welcome_page_scroll_down_to_end() {
        driver.get("https://www.amazon.in");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
    @When("Click on about us link")
    public void click_on_about_us_link() throws InterruptedException {
        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(60000);
        //driver.wait(45000);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));


    }
    @Then("Again click on readmore and get whole text at console")
    public void again_click_on_readmore_and_get_whole_text_at_console() {

       WebElement aboutUs = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div[1]/div/div[2]/div[3]/a"));
       aboutUs.click();
       WebElement subTitle= driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/article/div[1]"));
       WebElement para = driver.findElement(By.cssSelector("body > div.ArticlePage-contentWrapper > div.ArticlePage-wrapper > main > article > div.ArticlePage-articleBody.articleBody > div > div > p:nth-child(1)"));
       System.out.println("About Us :"+subTitle.getText());
       System.out.println(para.getText());

    }


}
