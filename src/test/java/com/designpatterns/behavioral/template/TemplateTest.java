package com.designpatterns.behavioral.template;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TemplateTest {
    
    @Test
    void testCSVDataProcessor() {
        DataProcessor processor = new CSVDataProcessor();
        String result = processor.process();
        
        assertThat(result).isEqualTo("CSV DATA");
    }
    
    @Test
    void testJSONDataProcessor() {
        DataProcessor processor = new JSONDataProcessor();
        String result = processor.process();
        
        assertThat(result).isEqualTo("json data");
    }
}
