package stepDefinition;


import io.cucumber.java.en.*;

public class Search {
    @Given("^I visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I visit the website as a guest user");
    }

    @When("^I select the books option from the dropdown$")
    public void i_select_the_books_option_from_the_dropdown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I select the books option from the dropdown");
    }

    @And("^I click on Search icon$")
    public void i_click_on_Search_icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on Search icon");
    }

    @Then("^I should see the books page loaded$")
    public void i_should_see_the_books_page_loaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see the books page loaded");
    }

    @And("^I should see Books at Amazon as heading$")
    public void i_should_see_Books_at_Amazon_as_heading() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see Books at Amazon as heading");
    }

    @But("^I should not see other category products$")
    public void i_should_not_see_other_category_products() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should not see other category products");
    }

    @When("^I select the Baby option from the dropdown$")
    public void i_select_the_Baby_option_from_the_dropdown() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I select the Baby option from the dropdown");
    }

    @Then("^I should see the Baby page loaded$")
    public void i_should_see_the_Baby_page_loaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see the Baby page loaded");
    }

    @Then("^I should see The baby store as heading$")
    public void i_should_see_The_baby_store_as_heading() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see The baby store as heading");
    }

}
