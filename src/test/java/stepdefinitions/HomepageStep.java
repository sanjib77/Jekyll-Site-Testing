package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStep extends BrowserFactory {
	
	Homepage page;
	Utility utility = new Utility();

@Given("you are on the homepage of jekyll") 
public void you_are_on_the_homepage_of_jekyll() {
	Browsersetup();
    initialize(); 
    page = new Homepage();
}

@When("user click on news button") 
public void user_click_on_news() {
    page.clicknews();
}

@Then("user redirects to the news page") 
public void user_redirects_to_the_news_page() {
    // Write code here that turns the phrase above into concrete actions
    assertEquals(driver.getTitle(),"News | Jekyll • Simple, blog-aware, static sites");
    try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    page.close();
}

@When("user clicks on Github button")
public void user_clicks_on_github_button() {
    // Write code here that turns the phrase above into concrete actions
    page.clickgithub();
}

@Then("user redirects to the Jekyll github repo")
public void user_redirects_to_the_Jekyll_github_page() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    assertEquals(driver.getTitle(),"GitHub - jekyll/jekyll: Jekyll is a blog-aware static site generator in Ruby");
    page.close();
}

@When("user click on Docs button")
public void user_click_on_Docs_button() {
    // Write code here that turns the phrase above into concrete actions
    page.clickdocs();
}

@Then("user redirects to the Docs Quickstart page")
public void user_redirects_to_the_Docs_Quickstart_page() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(driver.getTitle(),"Quickstart | Jekyll • Simple, blog-aware, static sites");
	driver.close();
}

@When("user clicks on resource button")
public void user_clicks_on_resource_button() {
    // Write code here that turns the phrase above into concrete actions
	page.clickresource();
    
}

@Then("user redirects to the resouce page")
public void user_redirects_to_the_resource_page() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(driver.getTitle(),"Resources | Jekyll • Simple, blog-aware, static sites");
    page.close();
}

@When("when user clicks on Showcase link")
public void when_user_clicks_on_showcase_link() {
    // Write code here that turns the phrase above into concrete actions
	page.clickshowcase();
}

@Then("user redirects to the Showcase page")
public void user_redirects_to_showcase_page() {
    // Write code here that turns the phrase above into concrete actions
	try {
		utility.takeSS();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(driver.getTitle(),"Showcase | Jekyll • Simple, blog-aware, static sites");
	page.close();
}

}
