package com.designpatterns.other.objectpool;

public class Connection {
    private static int counter = 0;
    private int id;

    public Connection() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void execute(String query) {
        System.out.println("Connection " + id + " executing: " + query);
    }
}
