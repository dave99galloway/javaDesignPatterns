package com.designpatterns.behavioral.state;

/**
 * State pattern context representing a vending machine.
 */
public class VendingMachine {
    private final State noCoinState;
    private final State hasCoinState;
    private State currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        currentState = noCoinState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void dispense() {
        currentState.dispense();
    }
}
