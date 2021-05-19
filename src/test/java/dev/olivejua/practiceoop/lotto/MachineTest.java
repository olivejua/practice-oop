package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MachineTest {

    private Machine machine;
    private int sizeOfBalls;

    @BeforeEach
    void setup() {
        machine = new Machine();
        sizeOfBalls = 45;
    }

    @Test
    void putBalls() {
        machine.putBalls(sizeOfBalls);
        List<Integer> balls = machine.balls;

        assertEquals(sizeOfBalls, balls.size());
    }

    @Test
    void notEqualBallsBeforeMixing() {
        machine.putBalls(sizeOfBalls);

        List<Integer> expectedBalls = new ArrayList<>();
        for (int i=1; i<= machine.balls.size(); i++) {
            expectedBalls.add(i);
        }

        assertTrue(equalsBalls(expectedBalls, machine.balls));
    }

    @Test
    void mixBalls() {
        machine.putBalls(sizeOfBalls);
        machine.mixBalls();

        List<Integer> expectedBalls = new ArrayList<>();
        for (int i=1; i<= machine.balls.size(); i++) {
            expectedBalls.add(i);
        }

        assertFalse(equalsBalls(expectedBalls, machine.balls));
    }

    @Test
    void pickWinningNumber() {
        machine.putBalls(sizeOfBalls);
        machine.mixBalls();
        int winningNumber = machine.pickWinningNumber();

        assertTrue(0<winningNumber);
        assertTrue(winningNumber<46);
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
