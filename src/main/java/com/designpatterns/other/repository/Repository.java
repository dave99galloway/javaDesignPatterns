package com.designpatterns.other.repository;

import java.util.*;

/**
 * Repository pattern for data access abstraction.
 */
public interface Repository<T> {
    void save(T entity);
    Optional<T> findById(String id);
    List<T> findAll();
    void delete(String id);
    boolean exists(String id);
}
