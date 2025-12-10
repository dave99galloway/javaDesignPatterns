package com.designpatterns.behavioral.command;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CommandTest {

    @Test
    void testLightOnCommand() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(command);
        remote.pressButton();

        assertThat(light.isOn()).isTrue();
    }

    @Test
    void testLightOffCommand() {
        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(onCommand);
        remote.pressButton();
        assertThat(light.isOn()).isTrue();

        remote.setCommand(offCommand);
        remote.pressButton();
        assertThat(light.isOn()).isFalse();
    }

    @Test
    void testUndoCommand() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(command);
        remote.pressButton();
        assertThat(light.isOn()).isTrue();

        remote.pressUndo();
        assertThat(light.isOn()).isFalse();
    }
}
