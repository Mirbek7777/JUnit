import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MissedCallsTests {

    @Test
    public void testAddMissedCalls(){
        Map<LocalDateTime, String> test = new TreeMap<>();
        test.put(LocalDateTime.now(), "8-916-226-21-22");

        assertNotNull(test);
    }
}