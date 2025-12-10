package com.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ComputerTest {
    
    @Test
    void testBuilderPattern() {
        Computer computer = new Computer.Builder()
                .cpu("Intel i9")
                .ram("32GB")
                .storage("1TB SSD")
                .gpu("RTX 4090")
                .wifi(true)
                .bluetooth(true)
                .build();
        
        assertThat(computer.getCpu()).isEqualTo("Intel i9");
        assertThat(computer.getRam()).isEqualTo("32GB");
        assertThat(computer.getStorage()).isEqualTo("1TB SSD");
        assertThat(computer.getGpu()).isEqualTo("RTX 4090");
        assertThat(computer.hasWifi()).isTrue();
        assertThat(computer.hasBluetooth()).isTrue();
    }
    
    @Test
    void testBuilderWithPartialData() {
        Computer computer = new Computer.Builder()
                .cpu("AMD Ryzen")
                .ram("16GB")
                .build();
        
        assertThat(computer.getCpu()).isEqualTo("AMD Ryzen");
        assertThat(computer.getRam()).isEqualTo("16GB");
        assertThat(computer.getStorage()).isNull();
        assertThat(computer.hasWifi()).isFalse();
    }
}
