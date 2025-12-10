package com.designpatterns.behavioral.template;

public class JSONDataProcessor extends DataProcessor {

    @Override
    protected String readData() {
        return "JSON data";
    }

    @Override
    protected String processData(String data) {
        return data.toLowerCase();
    }

    @Override
    protected void saveData(String data) {
        System.out.println("Saving JSON: " + data);
    }
}
