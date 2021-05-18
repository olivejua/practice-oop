package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Machine {
    List<Integer> balls = new ArrayList<>();

    public void putBalls(int sizeOfBalls) {
        for (int i=1; i<=sizeOfBalls; i++) {
            balls.add(i);
        }
    }

    public void mixBalls() {
        Collections.shuffle(balls);
    }
}
