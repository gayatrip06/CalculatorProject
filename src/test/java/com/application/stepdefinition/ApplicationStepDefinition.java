package com.application.stepdefinition;

import org.testng.Assert;

import com.application.actions.ApplicationActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationStepDefinition {

	ApplicationActions ApplicationPage;
	
@Given("User launch the application")
public void user_launch_the_application() {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.launchapplication();
}

@When("^I enter (.*) and (.*) and perform the multiplication operation$")
public void i_enter_and_and_perform_the_multiplication_operation(String int1,String int2) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.covStrToNu(int1+"×"+int2);
}

@Then("^Verify the Multiplication (.*)$")
public void verify_the_multiplication(Integer int1) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.checkMulAns(int1);
}

@When("^I enter (.*) and (.*) and perform the division operation$")
public void i_enter_and_and_perform_the_division_operation(String int1, String int2) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.covStrToNu(int1+"/"+int2);
}

@Then("^Verify the Division (.*)$")
public void verify_the_division(Integer int1) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.checkDivAns(int1); 
	
}

@When("^I enter (.*) and (.*) and perform the addition operation$")
public void i_enter_and_and_perform_the_addition_operation(String int1,String int2) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.covStrToNu(int1+"+"+int2);	
}

@Then("^Verify the Addition (.*)$")
public void verify_the_addition(Integer int1) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.checkAddAns(int1);
}

@When("^I enter (.*)and (.*) and perform the substraction operation$")
public void i_enter_and_and_perform_the_substraction_operation(String int1, String int2) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.covStrToNu(int1+"–"+int2);
}
@Then("^Verify the Substraction (.*)$")
public void verify_the_substraction(Integer int1) {
	ApplicationPage = ApplicationActions.getApplicationPage();
	ApplicationPage.checkSubAns(int1);
}

}
