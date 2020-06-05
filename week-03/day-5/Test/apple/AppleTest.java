package apple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    public void getApple() {
        Apple apple = new Apple ();
        assertEquals (apple.getApple());
    }

    private void assertEquals(String apple) {

    }
}