import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MissedCallsTests {


    @Test
    public void testAddMissedCalls(){
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls(phoneBook);
        missedCalls.addMissedCalls("1122");
        PhoneBook actual = missedCalls.getContact("1122");
        assertEquals(missedCalls.getName(), actual.getName());

        //Map<LocalDateTime, String> test = new TreeMap<>();
        //test.put(LocalDateTime.now(), "8-916-226-21-22");

        //assertNotNull(test);
    }
}