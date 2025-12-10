package com.designpatterns.cucumber;

import com.designpatterns.other.repository.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.Optional;
import static org.assertj.core.api.Assertions.*;

public class RepositorySteps {
    private UserRepository repository;
    private Optional<User> foundUser;
    
    @Given("a user repository exists")
    public void aUserRepositoryExists() {
        repository = new UserRepository();
    }
    
    @When("I save a user with id {string}, name {string}, email {string}")
    public void iSaveAUserWithIdNameEmail(String id, String name, String email) {
        User user = new User(id, name, email);
        repository.save(user);
    }
    
    @Then("I should be able to find user by id {string}")
    public void iShouldBeAbleToFindUserById(String id) {
        foundUser = repository.findById(id);
        assertThat(foundUser).isPresent();
    }
    
    @Then("the user should have name {string}")
    public void theUserShouldHaveName(String expectedName) {
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getName()).isEqualTo(expectedName);
    }
    
    @When("I delete user with id {string}")
    public void iDeleteUserWithId(String id) {
        repository.delete(id);
    }
    
    @Then("user with id {string} should not exist")
    public void userWithIdShouldNotExist(String id) {
        assertThat(repository.exists(id)).isFalse();
    }
}
