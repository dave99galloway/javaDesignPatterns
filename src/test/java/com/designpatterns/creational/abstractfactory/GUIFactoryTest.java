package com.designpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class GUIFactoryTest {

    @Test
    void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertThat(button).isInstanceOf(WindowsButton.class);
        assertThat(button.getStyle()).isEqualTo("Windows");
        assertThat(checkbox).isInstanceOf(WindowsCheckbox.class);
        assertThat(checkbox.getStyle()).isEqualTo("Windows");
    }

    @Test
    void testMacFactory() {
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        assertThat(button).isInstanceOf(MacButton.class);
        assertThat(button.getStyle()).isEqualTo("Mac");
        assertThat(checkbox).isInstanceOf(MacCheckbox.class);
        assertThat(checkbox.getStyle()).isEqualTo("Mac");
    }
}
