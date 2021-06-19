package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Login {
    public WebDriver driver;
    WebDriverWait wait;
    public Login()
    {
       // System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver =   Hooks.driver;  //new ChromeDriver();
    }


        @Given("user open the web page")
    public void user_open_the_web_page() throws Throwable {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 10);
            driver.manage().window().maximize();
            driver.get("https://demo.opensourcepos.org/login");
        }
//        wait = new WebDriverWait(driver,10);
//        wait.ignoring(WebDriverException.class);
//        wait.ignoring(StaleElementReferenceException.class);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//        driver.findElement(By.xpath("//input[@name='loginButton']")).click();    }

    @When("^user input username and password")
    public void user_input_invalid_username_and_password() throws Throwable {
        wait = new WebDriverWait(driver,10);
        wait.ignoring(WebDriverException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@name='loginButton']")).click();    }
    @Then("user see the dashboard")
    public void user_see_the_dashboard() {
        System.out.println("user see the dashboard");
    }
}


