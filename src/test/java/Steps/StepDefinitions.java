package Steps;

import Pages.Homepage;
import Utils.BrowserManager;
import Utils.QaPros;
import Utils.TestDataReader;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;

public class StepDefinitions {
    private WebDriver driver;
    Homepage homePage;
   HashMap<String,String>data;
   Scenario scenario;


    public StepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();
    }
    @Before(order = 1)
   public void before(Scenario scenario){
       this.scenario = scenario;
   }

    @Given("The User navigates to Home page")
    public void the_user_navigates_to_home_page()throws InvalidArgumentException {
       driver.get(QaPros.getValue("url"));
       homePage = new Homepage(driver);
        homePage.getClosed().sendKeys(Keys.ENTER);
        homePage.getSearchBar().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("The User Enter the product name")
    public void the_user_enter_the_product_name(){
       homePage = new Homepage(driver);
       homePage.getSearchBar().sendKeys(data.get("Input"));
       homePage.getSearchBar().sendKeys(Keys.ENTER);
    }
    @Then("The Product should be displayed")
    public void the_product_should_be_displayed(){
      String text = homePage.getSearchresult().getText();
        Assert.assertEquals(text,data.get("Input"));
    }

    @Then("The Home page should be displayed")
    public void the_home_page_should_be_displayed() {
        driver.get(QaPros.getValue("url"));
         homePage = new Homepage(driver);
        homePage.getSearchField().sendKeys(Keys.ENTER);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("The User should enter any one character")
    public void the_user_should_enter_any_one_character() {
        homePage = new Homepage(driver);
        homePage.getSearch().sendKeys(data.get("Input"));
        homePage.getSearch().sendKeys(Keys.ENTER);
    }

    @Then("Content page should be displayed")
    public void content_page_should_be_displayed() {
        String search = homePage.getSearchresult().getText();
        Assert.assertEquals(search,data.get("Input"));
    }

    @When("The User should enter the string in the search bar between spaces")
    public void the_user_should_enter_the_string_in_the_search_bar_between_spaces() {
        homePage = new Homepage(driver);
        homePage.getSearch().sendKeys(data.get("Input"));
        homePage.getSearch().sendKeys(Keys.ENTER);
    }

    @When("The User should entering text that starts with special character")
    public void the_user_should_entering_text_that_starts_with_special_character() {
        homePage = new Homepage(driver);
        homePage.getSearch().sendKeys(data.get("Input"));
        homePage.getSearch().sendKeys(Keys.ENTER);
    }


    @Given("user is able to access the search bar")
    public void userIsAbleToAccessTheSearchBar() {
        System.out.println("The user can access to the home page.");
    }


    @Then("Error page should be displayed")
    public void error_page_should_be_displayed() throws InvalidArgumentException{
        String error = homePage.getError().getText();
        Assert.assertEquals(error,"Sorry, no results found!");

    }
}

