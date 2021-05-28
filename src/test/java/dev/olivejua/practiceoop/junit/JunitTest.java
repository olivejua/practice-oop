package dev.olivejua.practiceoop.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {

    @Test
    void assertTest() {

        assertEquals(1, 1);
        assertNotEquals(1,2);
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});


        assertDoesNotThrow(() -> doSomething());
        assertFalse(false);
        assertTrue(true);
        assertThrows(Exception.class, () -> doSomethingThrow());

        assertNull(null);
        assertNotNull(new String());

        assertNotSame("blah blah", "blah blahhh");
        assertSame("blah blah", "blah blah");


//        assertAll();
//        assertIterableEquals(); //??
//        assertLinesMatch();
//        assertTimeout();
//        assertTimeoutPreemptively()
    }

    @Test
    void assertSameAndEqualsTest() {
        Color color1 = new Color();
        Color color2 = new Color();

        assertAll(
            () -> assertEquals(color1, color2, "myColor 값이 같으면 equals true가 되어야 한다."),
//            () -> assertSame(color1, color2, "myColor는 true가 나오면 안되지만 일단 테스트하나 끼워넣었다."),
            () -> assertNotSame(color1, color2, "myColor가 같아도 다른 객체이니 false가 나와야한다.")
        );
    }

    @Test
    void assertTimeoutTest() {
        assertTimeout(Duration.ofMillis(500), () -> new Color());
    }

    void doSomething() {

    }

    void doSomethingThrow() throws Exception {
        throw new Exception();
    }
}

class Color {
    String myColor = "red";

    @Override
    public boolean equals(Object o) {
        if (o instanceof Color) {
            Color c = (Color) o;
            return c.myColor.equals(this.myColor);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(myColor);
    }
}