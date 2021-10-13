import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTestKey {
    private Map<TestKey, String> testMap;

    @BeforeEach
    void setUp() {
        testMap = new HashMap<>();
        testMap.put(new TestKey("Nick"), "Neutron");
        testMap.put(new TestKey("Nike"), "Shoes");
    }

    @Test
    void checkCollisions() {
        assertEquals(testMap.get(new TestKey("Nick")), "Neutron");
        assertEquals(testMap.get(new TestKey("Nike")), "Shoes");
    }
}