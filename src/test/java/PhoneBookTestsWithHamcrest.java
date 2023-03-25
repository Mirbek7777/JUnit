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
    private String name;
    private String name1;

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
        Contact contact = new Contact("Петруха", "8541244");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroup("Друзя");
        phoneBook.addContactToGroups(contact, "Друзья");
        PhoneBook actual = phoneBook.getContact("8541244", phoneBook);
        assertEquals(contact.getName(), actual.getName());

        }

    private void assertEquals(String name, String name1) {

    }

    ;
        
        //map.get("Друзья").add("Петруха");
       // List<String> list = map.get("Друзья");

        //assertThat(list, contains( "Леха", "Петруха"));
        //assertThat(map, hasValue("Леха"));


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