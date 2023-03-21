import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTests {


    Contact sut;

    @BeforeEach
    public void beforeEach() {
        System.out.println("Contact test started");
        sut = new Contact("Доставка еды", "8-915-32-11");
    }

    @AfterEach
    public void afterEach(){
        sut = null;
        System.out.println("Contact test completed");
    }

    @Test
    public void testGetName() {
        String expected = "Доставка еды";

        String result = sut.getName();

        assertEquals(expected, result);
    }

    @Test
    public void testObjectNotNull() {
        assertNotNull(sut);
    }

    @Test
    public void testSetName() {
        String expected = "Суши";

        String result = sut.setName("Суши");

        assertEquals(expected,result);
    }
}