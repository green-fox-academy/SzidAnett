package green_fox_inheritance_exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void introduce() {
        Person peti = new Person();
        assertEquals("Hi, I'm Jane Doe, a 30 years old female.", peti.introduce());
    }

    @Test
    void introduceOther() {
        Person medard = new Person("Medárd", 27, "male");
        assertNotEquals("Hi, I'm Jane Doe, a 30 years old female.", medard.introduce());
        }
    }
