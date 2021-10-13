import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class TestKey {
    private final String key;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestKey)) return false;
        TestKey testKey = (TestKey) o;
        return Objects.equals(key, testKey.key);
    }

    @Override
    public int hashCode() {
        return key.charAt(0); //For testing purposes
    }


}
