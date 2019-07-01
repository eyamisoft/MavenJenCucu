package mainpackoch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mayne {

    WebDriver demo;

    @Given("^Open chrome and start application$")
    public void open_chrome_and_start_application() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Proxes\\Downloads\\JAVABuildTools\\chromedriver_win32\\chromedriver.exe");
        demo=new ChromeDriver();
        demo.get("http://www.demoaut.com");
    }

    @When("^user enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void user_enters_valid_and_valid(String arg1, String arg2) throws Throwable {

        demo.findElement(By.name("userName")).sendKeys(arg1);
        demo.findElement(By.name("password")).sendKeys(arg2);
        demo.findElement(By.name("login")).click();

    }

    @Then("^successful log in ensues$")
    public void successful_log_in_ensues() throws Throwable {

        if(demo.getTitle().equalsIgnoreCase("Find Flights")){
            System.out.println("Successful Login");
        } else{
            System.out.println("Invalid Credentials");
        }
    }
}
