package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MachineTest {

    @Test
    void getBalls() {
        Machine machine = new Machine();
        machine.putBalls();
//        List<Integer> balls = machine.balls;

//        assertEquals(45, balls.size());
    }
}
