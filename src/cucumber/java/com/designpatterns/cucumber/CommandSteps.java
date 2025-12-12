package com.designpatterns.cucumber;

import com.designpatterns.behavioral.command.Light;
import com.designpatterns.behavioral.command.LightOffCommand;
import com.designpatterns.behavioral.command.LightOnCommand;
import com.designpatterns.behavioral.command.RemoteControl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class CommandSteps {

    private final Light light;
    private final RemoteControl remoteControl;

    public CommandSteps(Light light, RemoteControl remoteControl) {
        this.light = light;
        this.remoteControl = remoteControl;
    }

    @Given("I have a Light")
    public void iHaveALight() {
        assertThat(light).isExactlyInstanceOf(Light.class).isNotNull();
    }

    @And("the light is switched off")
    public void theLightIsSwitchedOff() {
        assertThat(light).returns(false, Light::isOn);
    }

    @And("I have the Remote Control")
    public void iHaveTheRemoteControl() {
        assertThat(remoteControl).isExactlyInstanceOf(RemoteControl.class).isNotNull();
    }

    @When("I switch the light off")
    public void iSwitchTheLightOff() {
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.pressButton();
    }

    @Then("the light is switched on")
    public void theLightIsSwitchedOn() {
        assertThat(light).returns(true, Light::isOn);
    }

    @When("I switch the light on")
    public void iSwitchTheLightOn() {
        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.pressButton();
    }
}
