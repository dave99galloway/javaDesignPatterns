package com.designpatterns.other.objectpool;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConnectionPoolTest {

    @Test
    void testAcquireConnection() {
        ConnectionPool pool = new ConnectionPool(2);

        Connection conn1 = pool.acquire();
        assertThat(conn1).isNotNull();
        assertThat(pool.getInUseCount()).isEqualTo(1);
    }

    @Test
    void testReleaseConnection() {
        ConnectionPool pool = new ConnectionPool(2);

        Connection conn = pool.acquire();
        assertThat(pool.getInUseCount()).isEqualTo(1);

        pool.release(conn);
        assertThat(pool.getInUseCount()).isEqualTo(0);
        assertThat(pool.getAvailableCount()).isEqualTo(1);
    }

    @Test
    void testPoolLimit() {
        ConnectionPool pool = new ConnectionPool(2);

        pool.acquire();
        pool.acquire();

        assertThatThrownBy(() -> pool.acquire())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("No connections available");
    }
}
