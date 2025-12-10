package com.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SingletonTest {

    @Test
    void testSingletonInstance() {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    void testSingletonData() {
        Singleton instance = Singleton.INSTANCE;
        instance.setData("test data");

        assertThat(instance.getData()).isEqualTo("test data");
    }

    @Test
    void testPerformOperation() {
        Singleton instance = Singleton.INSTANCE;
        instance.setData("hello");

        String result = instance.performOperation();
        assertThat(result).contains("hello")
                .contains("Singleton operation executed");
    }
}
