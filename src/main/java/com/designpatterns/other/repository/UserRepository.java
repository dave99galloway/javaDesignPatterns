package com.designpatterns.other.repository;

import java.util.*;

public class UserRepository implements Repository<User> {
    private Map<String, User> database = new HashMap<>();
    
    @Override
    public void save(User user) {
        database.put(user.getId(), user);
    }
    
    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(database.get(id));
    }
    
    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }
    
    @Override
    public void delete(String id) {
        database.remove(id);
    }
    
    @Override
    public boolean exists(String id) {
        return database.containsKey(id);
    }
}
