package com.designpatterns.structural.composite;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CompositeTest {
    
    @Test
    void testCompositeStructure() {
        Composite root = new Composite("Root");
        Leaf leaf1 = new Leaf("Leaf1", 10.0);
        Leaf leaf2 = new Leaf("Leaf2", 20.0);
        
        root.add(leaf1);
        root.add(leaf2);
        
        assertThat(root.getComponents()).hasSize(2);
        assertThat(root.getComponents()).contains(leaf1, leaf2);
    }
    
    @Test
    void testNestedComposite() {
        Composite root = new Composite("Root");
        Composite branch = new Composite("Branch");
        Leaf leaf = new Leaf("Leaf", 15.0);
        
        branch.add(leaf);
        root.add(branch);
        
        assertThat(root.getComponents()).hasSize(1);
        assertThat(branch.getComponents()).hasSize(1);
    }
}
