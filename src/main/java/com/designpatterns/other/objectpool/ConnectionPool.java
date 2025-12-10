package com.designpatterns.other.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * Object Pool pattern for reusing expensive objects.
 */
public class ConnectionPool {
    private List<Connection> available = new ArrayList<>();
    private List<Connection> inUse = new ArrayList<>();
    private int maxPoolSize;

    public ConnectionPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public synchronized Connection acquire() {
        if (available.isEmpty()) {
            if (inUse.size() < maxPoolSize) {
                Connection conn = new Connection();
                inUse.add(conn);
                return conn;
            } else {
                throw new RuntimeException("No connections available");
            }
        } else {
            Connection conn = available.remove(available.size() - 1);
            inUse.add(conn);
            return conn;
        }
    }

    public synchronized void release(Connection conn) {
        inUse.remove(conn);
        available.add(conn);
    }

    public int getAvailableCount() {
        return available.size();
    }

    public int getInUseCount() {
        return inUse.size();
    }
}
