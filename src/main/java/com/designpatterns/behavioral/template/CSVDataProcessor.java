package com.designpatterns.behavioral.template;

public class CSVDataProcessor extends DataProcessor {
    
    @Override
    protected String readData() {
        return "CSV data";
    }
    
    @Override
    protected String processData(String data) {
        return data.toUpperCase();
    }
    
    @Override
    protected void saveData(String data) {
        System.out.println("Saving CSV: " + data);
    }
}
