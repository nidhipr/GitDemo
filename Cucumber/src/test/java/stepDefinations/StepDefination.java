package stepDefinations;



import java.awt.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("^User is on NetBanking landing Page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("user is on netbanking page");
	}

    /*@When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
       List<List<String>>  obj = data.asLists();
       System.out.println(obj.get(0).get(0));*/
    

    @Then("^Homepage is populated$")	
    public void homepage_is_populated() throws Throwable {
       
    }
    
    @When("^User log in to applicatin with (.+) and (.+)$")
    public void user_log_in_to_applicatin_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

}
