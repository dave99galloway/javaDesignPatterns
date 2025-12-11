package com.designpatterns.behavioral.command;

import com.sun.jdi.request.InvalidRequestStateException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
    void testUndoLightOnCommand() {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(command);
        remote.pressButton();
        assertThat(light.isOn()).isTrue();

        remote.pressUndo();
        assertThat(light.isOn()).isFalse();
    }

    @Test
    void testUndoLightOffCommand() {
        Light light = new Light();
        Command command = new LightOffCommand(light);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(command);
        remote.pressButton();
        assertThat(light.isOn()).isFalse();

        remote.pressUndo();
        assertThat(light.isOn()).isTrue();
    }

    @Test
    void testRemoteControlThrowsWhenPressButtonCommandNotSet() {
        RemoteControl remoteControl = new RemoteControl();

        assertThatThrownBy(remoteControl::pressButton).isExactlyInstanceOf(InvalidRequestStateException.class);
    }

    @Test
    void testRemoteControlThrowsWhenUndoCommandNotSet() {
        RemoteControl remoteControl = new RemoteControl();

        assertThatThrownBy(remoteControl::pressUndo).isExactlyInstanceOf(InvalidRequestStateException.class);
    }
}
