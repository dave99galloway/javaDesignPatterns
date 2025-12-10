package com.designpatterns.cucumber;

import com.designpatterns.behavioral.observer.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;

public class ObserverSteps {
    private NewsAgency agency;
    private Map<String, NewsChannel> channels = new HashMap<>();
    
    @Given("a news agency exists")
    public void aNewsAgencyExists() {
        agency = new NewsAgency();
    }
    
    @Given("a news channel {string} is subscribed")
    public void aNewsChannelIsSubscribed(String channelName) {
        NewsChannel channel = new NewsChannel(channelName);
        channels.put(channelName, channel);
        agency.attach(channel);
    }
    
    @When("the agency publishes {string}")
    public void theAgencyPublishes(String news) {
        agency.setNews(news);
    }
    
    @Then("{string} should receive {string}")
    public void shouldReceive(String channelName, String expectedNews) {
        NewsChannel channel = channels.get(channelName);
        assertThat(channel.getLatestNews()).isEqualTo(expectedNews);
    }
    
    @When("{string} unsubscribes")
    public void unsubscribes(String channelName) {
        NewsChannel channel = channels.get(channelName);
        agency.detach(channel);
    }
    
    @Then("{string} should still have {string}")
    public void shouldStillHave(String channelName, String expectedNews) {
        NewsChannel channel = channels.get(channelName);
        assertThat(channel.getLatestNews()).isEqualTo(expectedNews);
    }
}
