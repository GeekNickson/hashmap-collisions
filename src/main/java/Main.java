import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<TestKey, String> testCollision = new HashMap<>();
        testCollision.put(new TestKey("Nick"), "Neutron");
        testCollision.put(new TestKey("Nike"), "Shoes");

        System.out.println(testCollision.get(new TestKey("Nick")));
        System.out.println(testCollision.get(new TestKey("Nike")));
    }
}
