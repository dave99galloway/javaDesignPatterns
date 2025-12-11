package com.designpatterns.cucumber;

import com.designpatterns.creational.builder.Computer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderSteps {
    private Computer.Builder builder;
    private Computer computer;

    @Given("I start building a computer")
    public void iStartBuildingAComputer() {
        builder = new Computer.Builder();
    }

    @When("I set CPU to {string}")
    public void iSetCPUTo(String cpu) {
        builder.cpu(cpu);
    }

    @When("I set RAM to {string}")
    public void iSetRAMTo(String ram) {
        builder.ram(ram);
    }

    @When("I set storage to {string}")
    public void iSetStorageTo(String storage) {
        builder.storage(storage);
    }

    @When("I set GPU to {string}")
    public void iSetGPUTo(String gpu) {
        builder.gpu(gpu);
    }

    @When("I enable WiFi")
    public void iEnableWiFi() {
        builder.wifi(true);
    }

    @When("I enable Bluetooth")
    public void iEnableBluetooth() {
        builder.bluetooth(true);
    }

    @When("I build the computer")
    public void iBuildTheComputer() {
        computer = builder.build();
    }

    @Then("the computer should have CPU {string}")
    public void theComputerShouldHaveCPU(String expectedCpu) {
        assertThat(computer.getCpu()).isEqualTo(expectedCpu);
    }

    @Then("the computer should have RAM {string}")
    public void theComputerShouldHaveRAM(String expectedRam) {
        assertThat(computer.getRam()).isEqualTo(expectedRam);
    }

    @Then("the computer should have WiFi enabled")
    public void theComputerShouldHaveWiFiEnabled() {
        assertThat(computer.hasWifi()).isTrue();
    }

    @Given("I have these specs for a computer")
    public void iHaveTheseSpecsForAComputer(List<Computer> computerSpecs) {
        // having a stateful step definition structure hurts us here but this will do for now
        for (Computer spec : computerSpecs) {
            builder = builder.fromComputer(spec);
        }

    }

    @Then("the computer should have these specs")
    public void theComputerShouldHaveTheseSpecs(List<Computer> computerSpecs) {
        // having a stateful step definition structure hurts us here but this will do for now
        for (Computer spec : computerSpecs) {
            assertThat(spec).usingRecursiveComparison().isEqualTo(computer);
        }
    }
}
