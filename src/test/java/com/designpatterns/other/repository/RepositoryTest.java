package com.designpatterns.other.repository;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RepositoryTest {

    @Test
    void testSaveAndFindById() {
        UserRepository repository = new UserRepository();
        User user = new User("1", "John Doe", "john@example.com");

        repository.save(user);

        assertThat(repository.findById("1")).isPresent()
                .get()
                .extracting(User::getName, User::getEmail)
                .containsExactly("John Doe", "john@example.com");
    }

    @Test
    void testFindAll() {
        UserRepository repository = new UserRepository();
        repository.save(new User("1", "John", "john@example.com"));
        repository.save(new User("2", "Jane", "jane@example.com"));

        assertThat(repository.findAll()).hasSize(2);
    }

    @Test
    void testDelete() {
        UserRepository repository = new UserRepository();
        User user = new User("1", "John", "john@example.com");
        repository.save(user);

        assertThat(repository.exists("1")).isTrue();
        repository.delete("1");
        assertThat(repository.exists("1")).isFalse();
    }
}
