package com.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProxyImageTest {

    @Test
    void testProxyImageLazyLoading() {
        Image image = new ProxyImage("test.jpg");

        assertThat(image.getFileName()).isEqualTo("test.jpg");
    }
}
