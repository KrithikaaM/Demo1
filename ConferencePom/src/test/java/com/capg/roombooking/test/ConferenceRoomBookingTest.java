package com.capg.roombooking.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, glue = { "com.capg.roombooking.stepdefinition" }, tags = {
		"@execute" })
public class ConferenceRoomBookingTest {

	WebDriver driver = null;

	@Test
	public void test() {

		
}}