package com.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ObserverTest {

    @Test
    void testObserverPattern() {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");

        agency.attach(channel1);
        agency.attach(channel2);
        agency.setNews("Breaking News!");

        assertThat(channel1.getLatestNews()).isEqualTo("Breaking News!");
        assertThat(channel2.getLatestNews()).isEqualTo("Breaking News!");
    }

    @Test
    void testDetachObserver() {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel = new NewsChannel("CNN");

        agency.attach(channel);
        agency.setNews("News 1");
        assertThat(channel.getLatestNews()).isEqualTo("News 1");

        agency.detach(channel);
        agency.setNews("News 2");
        assertThat(channel.getLatestNews()).isEqualTo("News 1");
    }
}
