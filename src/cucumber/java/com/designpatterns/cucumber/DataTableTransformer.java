package com.designpatterns.cucumber;

import com.designpatterns.creational.builder.Computer;
import com.designpatterns.creational.prototype.Circle;
import io.cucumber.java.DataTableType;

import java.util.Map;

@SuppressWarnings({"unused", "cucumberBinding"})
public class DataTableTransformer {

    //same converters used in step arg transforms whter single instance or list depending on whether the arg asks for an instance or a list
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

    @DataTableType
    public Circle circleEntry(Map<String, String> entry) {
        var circle = new Circle();
        circle.setRadius(Integer.parseInt(entry.get("radius")));
        circle.setX(Integer.parseInt(entry.get("x")));
        circle.setY(Integer.parseInt(entry.get("y")));

        return circle;

    }
}
