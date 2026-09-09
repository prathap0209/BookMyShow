package com.StepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.BaseClass.BaseClass;
import com.PomClass.PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

    PomClass pom = new PomClass();
    
    @Given("I launch application of bookmyshow")
    public void i_launch_application_of_bookmyshow() throws Exception {
    	launchApplication();
    }
    
    @When("I click on Skip")
    public void i_click_on_skip()  {
        tap(pom.skipButton);
       

    }

    @When("I click on Continue with mobile number")
    public void i_click_on_continue_with_mobile_number() {
        tap(pom.continueWithMobile);

    }

    @When("I enter mobile number {string}")
    public void i_enter_mobile_number(String mobileNumber) {
       entertext(pom.mobileNumber, mobileNumber);

    }

    @When("I click on Verify")
    public void i_click_on_verify() {
        tap(pom.verifyButton);
        tap(pom.otpback);
        tap(pom.mobilenumback);

    }
    
    @When("I click on skip button")
    public void i_click_on_skip_button() {

        tap(pom.skip);
    }
    @When("I click on select manually")
    public void i_click_on_select_manually() {
        tap(pom.selectmanually);
      
    }
    @When("I select chennai as location")
    public void i_select_chennai_as_location() {
       tap(pom.locationchennai);
      
    }
    
    @When("I click on Movies")
    public void i_click_on_movies() {
    	
        tap(pom.searchmovies);
        entertext(pom.entermovie, "Vishwanath and Sons");
    }

    @When("I select Vishwanath and Sons movie")
    public void i_select_vishwanath_and_sons_movie() {
        tap(pom.vishwanathAndSons);
    }

    @When("I click on Book tickets")
    public void i_click_on_book_tickets() {
    	waitforvisiblity(pom.bookTickets);
        tap(pom.bookTickets);
    }


    @When("I select 2D format")
    public void i_select_2d_format() {
        tap(pom.tamil2D);
    }


    @When("I select AGS Navalur")
    public void i_select_ags_navalur() {
//        tap(pom.searchtheatre);
//        entertext(pom.sendtheatredetails, "AGS Navalur");
    }

    @When("I select 11:40 AM show")
    public void i_select_1140_am_show() {
    	waitfortap(pom.show1140AM);
        tap(pom.show1140AM);
        
       
    }

    @When("I select seat F5")
    public void i_select_seat_f5() {
    	waitfortap(pom.seatselect);
        tap(pom.seatselect);
      
    }

    @When("I select seat F6")
    public void i_select_seat_f6() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	Map<String, Object> args = new HashMap<>();
    	args.put("x", 720);
    	args.put("y", 1080);
    	js.executeScript("mobile: clickGesture", args);
    	Thread.sleep(3000);
    }

    @When("I click on Pay button")
    public void i_click_on_pay_button(){
    	
        tap(pom.payButton);
    }

    @When("I accept the Terms and Conditions")
    public void i_accept_the_terms_and_conditions() {
    	waitfortap(pom.okButton);
        tap(pom.okButton);
      
        waitfortap(pom.skipbutton2);
        tap(pom.skipbutton2);
       
    }

    @When("I update email and contact number in details page")
    public void i_update_email_and_contact_number_in_details_page() {
       entertext(pom.detailsemail, "abc@gmail.com");
    	entertext(pom.detailsphonenumber, "9092023395");
    }
    @When("I click on update button")
    public void i_click_on_update_button() {
      tap(pom.detailsupdatebutton);
    }
    @When("I click continue button in ticket details page")
    public void i_click_continue_button_in_ticket_details_page() {
    	waitfortap(pom.continuebuttondetailspage);
       tap(pom.continuebuttondetailspage);
      
    }
    @Then("I should see the Payment page")
    public void i_should_see_the_payment_page() {
      
    }

    
    @When("the user taps on Movies")
    public void the_user_taps_on_movies() {
    waitfortap(pom.movies);
       tap(pom.movies);
      
    }

    @Then("the Movies page should be displayed")
    public void the_movies_page_should_be_displayed() {
    	waitforvisiblity(pom.moviesPage);
        Assert.assertTrue(driver.findElement(pom.moviesPage).isDisplayed());

    }

    @When("the user taps on Live Events")
    public void the_user_taps_on_live_events() {
    	waitfortap(pom.liveEvents);
          tap(pom.liveEvents);
         

    }
    @Then("the Live Events page should be displayed")
    public void the_live_events_page_should_be_displayed() {
    	waitforvisiblity(pom.liveEventsPage);
        Assert.assertTrue(driver.findElement(pom.liveEventsPage).isDisplayed());

    }
    @When("the user taps on Profile")
    public void the_user_taps_on_profile()  {
    	waitfortap(pom.profile);
       tap(pom.profile);



    }
    @Then("the Profile page should be displayed")
    public void the_profile_page_should_be_displayed() {
    	waitforvisiblity(pom.profilePage);
        Assert.assertTrue(driver.findElement(pom.profilePage).isDisplayed());

    }
    
    @When("I click on Home")
    public void i_click_on_home() {
       tap(pom.homeButton);
       
    }

    @When("I click on location")
    public void i_click_on_location() {

        tap(pom.locationButton);

    }

    @When("I enter invalid location {string}")
    public void i_enter_invalid_location(String location) {
        entertext(pom.locationSearch, location);

    }

    @Then("invalid location should not be displayed")
    public void invalid_location_should_not_be_displayed() {
        Assert.assertTrue(driver.findElement(pom.invalidLocation).isDisplayed());

    }
    
    @Given("I click on Profile")
    public void i_click_on_profile() {
        tap(pom.profile);

    }

    @When("I click on Your Orders")
    public void i_click_on_your_orders() {
        tap(pom.yourOrders);

    }

    @Then("Your Orders page should be displayed")
    public void your_orders_page_should_be_displayed() {

        Assert.assertTrue(driver.findElement(pom.yourOrdersPage).isDisplayed());

    }
    
    @When("I click on Stream Library")
    public void i_click_on_stream_library() {
        tap(pom.streamLibrary);

    }

    @Then("Stream Library page should be displayed")
    public void stream_library_page_should_be_displayed() {

        Assert.assertTrue(driver.findElement(pom.streamLibraryPage).isDisplayed());

    }
    
    @When("I click on Help Centre")
    public void i_click_on_help_centre() {
        tap(pom.helpCentre);

    }

    @Then("Help Centre page should be displayed")
    public void help_centre_page_should_be_displayed() {
        Assert.assertTrue(
            driver.findElement(pom.helpCentrePage).isDisplayed()
        );

    }


}
