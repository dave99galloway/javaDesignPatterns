package com.designpatterns.behavioral.observer;

public class NewsChannel implements Observer {
    private final String name;
    private String latestNews;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.latestNews = message;
        System.out.println(name + " received news: " + message);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getLatestNews() {
        return latestNews;
    }
}
