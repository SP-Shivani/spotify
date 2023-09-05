package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pdlPage {

    public static WebDriver driver;

    @Given("user is in the pdl page")
    public void user_is_in_the_pdl_page() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--window-size=1400,600");
        driver=new ChromeDriver(options);
        //driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
        driver.get("https://wwwuatb.gdn-app.com/cari/samsang");
    }

    @When("user clicks the satu line")
    public void user_clicks_the_satu_line() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scroll(0,2200)");
        driver.findElement(By.xpath("//button[@class='ticker__close b-order-right']")).click();

    }

    @Then("verify that the satu line page appears")
    public void verify_that_the_satu_line_page_appears() {
        Assert.assertEquals("Automated Auto Formate Title","driver.getTitle()");
        //driver.close();
    }
}
