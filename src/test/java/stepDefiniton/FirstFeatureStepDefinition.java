package stepDefiniton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFeatureStepDefinition {


    static WebDriver myDriver;


    @Given("^I am a Facebook user$")
    public void i_am_a_Facebook_user() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\uma_g\\IdeaProjects\\MySecondMavenProject\\src\\chromedriver.exe");
        myDriver = new ChromeDriver();
    }

    @When("^I access Facebook website$")

    public void i_access_Facebook_website () {

        myDriver.get("https://www.facebook.com/");
    }

    @Then("^I see Facebook Home Page$")
    public void I_see_Facebook_Home_page () {
       // myDriver.close();
    }


}
