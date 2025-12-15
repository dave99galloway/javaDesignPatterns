package com.designpatterns.cucumber;

import com.designpatterns.creational.builder.Computer;
import com.designpatterns.creational.prototype.Circle;
import com.designpatterns.creational.prototype.CircleUpdate;
import io.cucumber.java.DataTableType;

import java.util.Map;
import java.util.Optional;

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
        if (entry.get("radius") != null) circle.setRadius(Integer.parseInt(entry.get("radius")));
        if (entry.get("x") != null) circle.setX(Integer.parseInt(entry.get("x")));
        if (entry.get("y") != null) circle.setY(Integer.parseInt(entry.get("y")));

        return circle;

    }

    //CircleUpdate
    @DataTableType
    public CircleUpdate updateEntry(Map<String, String> entry) {
        Optional<Integer> x = (entry.get("x") != null) ? Optional.of(Integer.parseInt(entry.get("x"))) : Optional.empty();
        Optional<Integer> y = (entry.get("x") != null) ? Optional.of(Integer.parseInt(entry.get("x"))) : Optional.empty();
        Optional<Integer> radius = (entry.get("radius") != null) ? Optional.of(Integer.parseInt(entry.get("radius"))) : Optional.empty();
        return new CircleUpdate(x, y, radius);
    }
}
