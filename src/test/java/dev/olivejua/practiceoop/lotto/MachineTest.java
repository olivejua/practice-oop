package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MachineTest {

    private Machine machine;

    @BeforeEach
    void setup() {
        machine = new Machine();
    }

    @Test
    void putBalls() {
        int sizeOfBalls = 45;
        machine.putBalls(sizeOfBalls);
        List<Integer> balls = machine.balls;

        assertEquals(sizeOfBalls, balls.size());
    }

    @Test
    void notEqualBallsBeforeMixing() {
        int sizeOfBalls = 45;
        machine.putBalls(sizeOfBalls);

        List<Integer> expectedBalls = new ArrayList<>();
        for (int i=1; i<= machine.balls.size(); i++) {
            expectedBalls.add(i);
        }

        assertTrue(equalsBalls(expectedBalls, machine.balls));
    }

    @Test
    void mixBalls() {
        int sizeOfBalls = 45;
        machine.putBalls(sizeOfBalls);
        machine.mixBalls();

        List<Integer> expectedBalls = new ArrayList<>();
        for (int i=1; i<= machine.balls.size(); i++) {
            expectedBalls.add(i);
        }

        assertFalse(equalsBalls(expectedBalls, machine.balls));
    }

    private boolean equalsBalls(List<Integer> expected, List<Integer> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }

        for (int i=0; i<expected.size(); i++) {
            if (!expected.get(i).equals(actual.get(i))) {
                return false;
            }
        }

        return true;
    }
}
