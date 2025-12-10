package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern implementation representing a tree structure.
 */
public class Composite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println(name);
        for (Component component : components) {
            component.showDetails();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public List<Component> getComponents() {
        return new ArrayList<>(components);
    }
}
