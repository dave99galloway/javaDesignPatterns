package com.designpatterns.behavioral.state;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StateTest {
    
    @Test
    void testVendingMachineStates() {
        VendingMachine machine = new VendingMachine();
        
        assertThat(machine.getCurrentState().getStateName()).isEqualTo("NoCoin");
        
        machine.insertCoin();
        assertThat(machine.getCurrentState().getStateName()).isEqualTo("HasCoin");
        
        machine.dispense();
        assertThat(machine.getCurrentState().getStateName()).isEqualTo("NoCoin");
    }
    
    @Test
    void testEjectCoin() {
        VendingMachine machine = new VendingMachine();
        
        machine.insertCoin();
        assertThat(machine.getCurrentState().getStateName()).isEqualTo("HasCoin");
        
        machine.ejectCoin();
        assertThat(machine.getCurrentState().getStateName()).isEqualTo("NoCoin");
    }
}
