package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class samsangPage {

    public static WebDriver driver;

    @Given("user enters the page")
    public void user_enters_the_page() {


        //WebDriverManager.driver.setup();
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        driver=new ChromeDriver(options);
        //driver.manage().window().fullscreen();
        System.setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
        driver.get("https://wwwuatb.gdn-app.com/cari/samsang");
    }

    @When("user clicks the  buttons")
    public void user_clicks_the_buttons() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class='blu-btn b-secondary b-small']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='ticker__close b-order-right']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@for='merchantVoucher']")).click();

    }
    @Then("the page displays")
    public void the_page_displays() {
        Assert.assertEquals(driver.getTitle(),"Online Mall Blibli.com, Sensasi Belanja Online Shop ala Mall");
    }






}
