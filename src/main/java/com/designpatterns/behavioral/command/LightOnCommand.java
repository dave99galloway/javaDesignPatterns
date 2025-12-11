package com.designpatterns.behavioral.command;

import javax.annotation.Nonnull;

public class LightOnCommand implements Command {
    @Nonnull
    private final Light light;

    public LightOnCommand(@Nonnull Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
