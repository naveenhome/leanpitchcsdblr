package csd.blr.test.java;

import junit.framework.TestCase;
import csd.blr.main.java.Search;
import csd.blr.main.java.SearchBLL;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeanpitchSteps extends TestCase{
	Search obj;
	SearchBLL searchBLL;
	String button;
	@Given("^user enter \"([^\"]*)\" in search box$")
	public void user_enter_in_search_box(String searchKey) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		obj = new Search();
		obj.setKey(searchKey);
	}

	@When("^Click on Search$")
	public void Click_on_Search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		button = "Submit";
	}

	@Then("^result should be around (\\d+)$")
	public void result_should_be_around(int searchCount) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		searchBLL = new SearchBLL();
		assertEquals(searchCount, searchBLL.searchResult(obj));
		
		
	}
	@When("^Click on Reset$")
	public void Click_on_Reset() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	@Given("^browser is \"([^\"]*)\"$")
	public void browser_is(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}


}
