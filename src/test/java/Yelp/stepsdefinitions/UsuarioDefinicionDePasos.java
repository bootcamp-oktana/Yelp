package Yelp.stepsdefinitions;

import Yelp.steps.UsuarioYelp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UsuarioDefinicionDePasos {
    @Steps(shared=true)
    UsuarioYelp usuario;

    @Given("^user navigates to https://www.yelp.com/$")
    public void userNavigateToYelp() {
    }

    @And("^selects find Restaurants$")
    public void userSearch() {
    }

    @Given("^User search restaurant (.*)$")
    public void userSearchRestaurant(String restaurant) {
    }

    @When("^filters by (.*)$")
    public void userSelectFilter(String filter){
    }

    @And("^select the first search result$")
    public void userSelectFirstResult(){
    }

    @Then("^User views restaurant information$")
    public void userViewDetails() {
    }
}
