package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {

    @Test
    void holdEventTest() {
        assertEquals(Event.class, Event.holdEvent().getClass());
    }
}
