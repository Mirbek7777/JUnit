import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTests {

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
    void testCreateGroup(){
        map.put("Работа", new ArrayList<>());
        boolean expected = true;

        boolean result = map.containsKey("Работа");

        assertEquals(expected, result);
    }

    @Test
    void testAvailabilityGroup() {
        boolean expected = true;

        boolean result = map.containsKey("Друзья");

        assertEquals(expected, result);
    }

    @Test
    void testAddContactToGroups() {
        Contact contact = new Contact("Петруха", "8541244");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroup("Друзя");
        phoneBook.addContactToGroups(contact, "Друзья");
        PhoneBook actual = phoneBook.getContact("8541244", phoneBook);
        assertEquals(contact.getName(), actual.getName());




        //String[] expected = new String[]{"Леха","Петруха"};

        //map.get("Друзья").add("Петруха");
       // String[] result = map.get("Друзья").toArray(new String[0]);

        //assertArrayEquals(expected, result);
    }


    @Test
    void getContact() {
        String[] expected = new String[]{"Леха"};

        String[] result = map.get("Друзья").toArray(new String[0]);

        assertArrayEquals(expected, result);
    }
}