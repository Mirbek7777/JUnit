import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PhoneBookTestsWithHamcrest {

    private Map<String, List<String>> map;

    @BeforeEach
    public void beforeEach(){
        map = new HashMap<>();
        map.put("Друзья", new ArrayList<>());
        map.get("Друзья").add("Леха");
        System.out.println("Test started");
    }

    @AfterEach
    public void afterEach(){
        map = null;
        System.out.println("Test completed");
    }

    @Test
    void testCreateGroupWithHamcrest() {
        map.put("Работа", new ArrayList<>());

        assertThat(map, hasKey("Работа"));
    }

    @Test
    void addContactToGroupsWithHamcrest() {
        map.get("Друзья").add("Петруха");
        List<String> list = map.get("Друзья");

        assertThat(list, contains( "Леха", "Петруха"));
        //assertThat(map, hasValue("Леха"));
    }

    @Test
    void getGroups() {
    }

    @Test
     void getContactWithHamcrest() {
        map.get("Друзья").add("Петруха");
        List<String> list = map.get("Друзья");

        assertThat(list, contains( "Леха", "Петруха"));

    }
}