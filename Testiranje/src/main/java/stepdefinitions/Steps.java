package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.Base;
import selenium.HomePage;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

public class Steps extends HomePage{

   static HashMap<String, Integer> chanelMap = new HashMap<>();

    static {
        chanelMap.put("facebook",1);
        chanelMap.put("twitter" ,2);
        chanelMap.put("instagram", 3);
    }

    @Before
    public void openDriver(){
        createChromeDriver("/home/himera/Desktop/chromedriver");
    }
    @After
    public void kill(){
        quitDriver();
    }

    @Given("I am on home page")
    public void i_am_on_home_page() {
        openUrl("https://www.b92.net/");
    }

    @Then("I see number of filters with drop down is {int}")
    public void i_see_number_of_filters_with_drop_down_is(Integer int1) {
        checkDropdown(dropdown);
    }

    @When("I click on first visible car")
    public void i_click_on_first_visible_car() {
        firstCar(firstCarInList);

    }

    @When("I go to new opened window")
    public void i_go_to_new_opened_window() {

    }

    @Then("I print our price")
    public void i_prin_tour_price() {
        price();
    }

    @When("I open fuel menu")
    public void i_open_fuel_menu() {
       fuel();
    }

    @Then("I see that i ddid not o well")
    public void i_see_that_i_ddid_not_o_well() {
        listFuel();
    }

    @When("I mouse over more section")
    public void i_mouse_over_more_section() {

    }

    @Then("I should see {int} items")
    public void i_should_see_item(Integer int1) {

    }

    @Then("There should be items")
    public void there_should_be_items(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("I go to vremenska prognoza")
    public void i_go_to_vremenska_prognoza() {

    }

    @Then("I should se current date")
    public void i_should_se_current_date() {

        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String date = dateTimeFormatter.format(now);
        List<String> text = getTextFromElement()
    }

}
