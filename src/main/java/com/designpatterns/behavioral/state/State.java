package com.designpatterns.behavioral.state;

/**
 * State interface for State pattern.
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void dispense();
    String getStateName();
}
