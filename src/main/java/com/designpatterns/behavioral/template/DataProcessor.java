package com.designpatterns.behavioral.template;

/**
 * Template Method pattern abstract class.
 */
public abstract class DataProcessor {

    // Template method
    public final String process() {
        String data = readData();
        String processed = processData(data);
        saveData(processed);
        return processed;
    }

    protected abstract String readData();

    protected abstract String processData(String data);

    protected abstract void saveData(String data);
}
