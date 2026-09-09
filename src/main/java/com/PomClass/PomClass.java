package com.PomClass;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PomClass {

	// BookMyShow
	public By skipButton = AppiumBy.id("com.bt.bms:id/skip_for_now");
	public By continueWithMobile = AppiumBy.id("com.bt.bms:id/signup_et_mobileno");
	public By mobileNumber = AppiumBy.id("com.bt.bms:id/phone_text_field");
	public By verifyButton =AppiumBy.id("com.bt.bms:id/continue_btn");
	
	public By skip = AppiumBy.id("com.bt.bms:id/launcher_tv_for_skip");
	public By selectmanually = AppiumBy.id("com.bt.bms:id/btn_negative");
	public By locationchennai = AppiumBy.xpath("//android.widget.TextView[@text='Chennai']");
	public By otpback = AppiumBy.accessibilityId("Close");
	public By mobilenumback = AppiumBy.id("com.bt.bms:id/ic_back");
	
	// Movie Booking

	public By searchmovies = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/menu_item_container_header_main\"]/android.view.ViewGroup[1]");
	public By entermovie = AppiumBy.id("com.bt.bms:id/edtSearch");
	public By vishwanathAndSons =AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.bt.bms:id/rvResults\"]/android.widget.FrameLayout[1]/android.view.ViewGroup");

	public By bookTickets = AppiumBy.xpath("//android.widget.TextView[@text=\"Book tickets\"]");
	public By tamil2D = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.bt.bms:id/recycler_lang_dimen_movie_format\"]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.Button[@text=\"2D\"]");

	public By searchtheatre =AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/action_menu_container_search_toolbar\"]/android.view.ViewGroup[1]");
	public By sendtheatredetails = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.bt.bms:id/title_search_toolbar\"]");
	// Show time

	public By show1140AM =AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.bt.bms:id/movie_show_timing_text\" and @text=\"10:25 PM\"]");

	// Seats
	public By seatselect = AppiumBy.id("com.bt.bms:id/select_seats_button_picker");
	public By seatF6 =AppiumBy.xpath("//*[@content-desc='F6']");
	// Pay
	public By payButton =AppiumBy.id("com.bt.bms:id/pay_button_seat_layout");
	public By skipbutton2 =AppiumBy.id("com.bt.bms:id/skip_fnb");
	public By detailsemail =AppiumBy.id("com.bt.bms:id/email_address");
	
	public By detailsphonenumber =AppiumBy.id("com.bt.bms:id/phone_number");
	public By detailsupdatebutton =AppiumBy.id("com.bt.bms:id/submitDetailsView");
	public By okButton =AppiumBy.id("com.bt.bms:id/primary_cta_venue_message_showtimes");
	
	public By continuebuttondetailspage =AppiumBy.xpath("//android.widget.Button");
	
	// Bottom Navigation

	public By movies = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/bottom_navigation_bar\"]/android.widget.RelativeLayout[2]");
	public By liveEvents = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/bottom_navigation_bar\"]/android.widget.RelativeLayout[3]");
	public By profile = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/bottom_navigation_bar\"]/android.widget.RelativeLayout[4]");

	// Page Validation

	public By moviesPage = AppiumBy.id("com.bt.bms:id/title_header_main");
	public By liveEventsPage = AppiumBy.id("com.bt.bms:id/title_header_main");
	public By profilePage = AppiumBy.id("com.bt.bms:id/title_header_main");	
	// Home

	public By homeButton = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/bottom_navigation_bar\"]/android.widget.RelativeLayout[1]");
	// Location

	public By locationButton = AppiumBy.id("com.bt.bms:id/subtitle_header_main");
	public By locationSearch =AppiumBy.xpath("//android.widget.EditText[@text=\"Search for your city\"]");
	public By invalidLocation = AppiumBy.xpath("//android.widget.TextView[@text=\"Sorry! No result found\"]");
	
	// Profile

	public By profile2 = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.bt.bms:id/bottom_navigation_bar\"]");

	// Profile options

	public By yourOrders = AppiumBy.xpath("//*[@text='Your Orders']");
	public By streamLibrary = AppiumBy.xpath("//*[@text='Stream Library']");
	public By playCreditCard = AppiumBy.xpath("//*[@text='Play Credit Card']");
	public By helpCentre = AppiumBy.xpath("//*[@text='Help Centre']");
	public By accountsSettings = AppiumBy.xpath("//*[@text='Accounts & Settings']");
	public By rewards = AppiumBy.xpath("//*[@text='Rewards']");
	public By offers = AppiumBy.xpath("//*[@text='Offers']");

	// Validation

	public By yourOrdersPage = AppiumBy.xpath("//*[@text='Your Orders']");
	public By streamLibraryPage = AppiumBy.xpath("//*[@text='Stream Library']");
	public By playCreditCardPage = AppiumBy.xpath("//*[@text='Play Credit Card']");
	public By helpCentrePage = AppiumBy.xpath("//*[@text='Help Centre']");
	public By accountsSettingsPage = AppiumBy.xpath("//*[@text='Accounts & Settings']");
	public By rewardsPage = AppiumBy.xpath("//*[@text='Rewards']");
	public By offersPage = AppiumBy.xpath("//*[@text='Offers']");
}
