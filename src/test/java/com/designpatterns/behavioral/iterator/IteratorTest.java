package com.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class IteratorTest {

    @Test
    void testBookIterator() {
        BookCollection collection = new BookCollection();
        collection.addBook("Book 1");
        collection.addBook("Book 2");
        collection.addBook("Book 3");

        Iterator<String> iterator = collection.createIterator();

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("Book 1");
        assertThat(iterator.next()).isEqualTo("Book 2");
        assertThat(iterator.next()).isEqualTo("Book 3");
        assertThat(iterator.hasNext()).isFalse();
    }
}
