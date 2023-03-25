import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ContactTestsWithHamcrest {

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
    public void testGetNameWithHamcrest() {
        String expected = "Доставка еды";


        assertThat(expected, equalTo(sut.getName()));
    }

    @Test
    public void testObjectNotNullWithHamcrest() {
        assertThat(sut,notNullValue());
    }

    @Test
    public void testSetNameWithHamcrest() {

        String expected = "Суши";

        assertThat(expected, equalTo(sut.setName("Суши")));
    }

}