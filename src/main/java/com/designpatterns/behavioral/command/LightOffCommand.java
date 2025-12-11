package com.designpatterns.behavioral.command;

import javax.annotation.Nonnull;

public class LightOffCommand implements Command {

    @Nonnull
    private final Light light;

    public LightOffCommand(@Nonnull Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
