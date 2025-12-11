package com.designpatterns.cucumber;

import com.designpatterns.creational.builder.Computer;
import io.cucumber.java.DataTableType;

import java.util.Map;

@SuppressWarnings({"unused", "cucumberBinding"})
public class DataTableTransformer {

    @DataTableType
    public Computer computerEntry(Map<String, String> entry) {
        return new Computer.Builder().cpu(entry.get("CPU"))
                .ram(entry.get("RAM"))
                .bluetooth(Boolean.parseBoolean(entry.get("Bluetooth")))
                .storage(entry.get("Storage"))
                .gpu(entry.get("GPU"))
                .wifi(Boolean.parseBoolean(entry.get("WiFi")))
                .build();
    }
}
