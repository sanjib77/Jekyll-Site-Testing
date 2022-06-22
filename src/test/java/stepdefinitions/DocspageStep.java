package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.docspage.Docspage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DocspageStep extends BrowserFactory{
	
	Docspage page;
	Utility utility = new Utility();
	
	@Given("you are on the docs page of jekyll") //done
	public void you_are_on_the_docs_page_of_jekyll() {
		Browsersetup();
	    initialize();
	    page = new Docspage();
	    page.docsclick();
	    
	}

	@When("user click on improve this page link") //done
	public void user_click_on_improve_this_page_link() {
	    page.editlinkclick();
	}

	@Then("user redirects to the github login page.") //done
	public void user_redirects_to_the_github_login_page() {
		assertEquals(driver.getTitle(),"Sign in to GitHub · GitHub");
	    try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    page.close();
	}

	@When("user clicks on a step by step tutorial link") //done
	public void user_clicks_on_a_step_by_step_tutorial_link() {
	    page.tutoriallinkclick();
	}

	@Then("user redirects to the setup page.") //done
	public void user_redirects_to_the_setup_page() {
		assertEquals(driver.getTitle(),"Setup | Jekyll • Simple, blog-aware, static sites");
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    page.close();
	}

	@Given("you are on the setup page of jekyll") //done
	public void you_are_on_the_setup_page_of_jekyll() {
		Browsersetup();
	    initialize();
	    page = new Docspage();
	    page.docsclick();
	    page.tutoriallinkclick();
	}

	@When("user click on next button in the set up page")
	public void user_click_on_next_button_in_the_set_up_page() {
	    page.nextbuttonclick();
	}

	@Then("user redirects to the Liquid page.") //done
	public void user_redirects_to_the_liquid_page() {
		assertEquals(driver.getTitle(),"Liquid | Jekyll • Simple, blog-aware, static sites");
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    page.close();
	}

	@Given("you are on the Liquid page of jekyll") //done
	public void you_are_on_the_liquid_page_of_jekyll() {
		Browsersetup();
	    initialize();
	    page = new Docspage();
	    page.docsclick();
	    page.tutoriallinkclick();
	    page.nextbuttonclick();
	}

	@When("user click on back button in the Liquid page") //done
	public void user_click_on_back_button_in_the_liquid_page() {
	    page.backbuttonclick();
	}

	@Then("user redirects to the set up page.") //done
	public void user_redirects_to_the_set_up_page() {
		assertEquals(driver.getTitle(),"Setup | Jekyll • Simple, blog-aware, static sites");
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    page.close();
	}

	@When("user click on data files link in the set up page") //done
	public void user_click_on_data_files_link_in_the_set_up_page() {
	    page.datafileslinkclick();
	}

	@Then("user redirects to the data files page.") //done
	public void user_redirects_to_the_data_files_page() {
		assertEquals(driver.getTitle(),"Data Files | Jekyll • Simple, blog-aware, static sites");
		try {
			utility.takeSS();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    page.close();
	}

}
