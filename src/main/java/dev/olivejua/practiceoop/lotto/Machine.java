package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Machine {
    private final int sizeOfWinningBalls = 6;
    List<Integer> balls = new ArrayList<>();

    public void putBalls(int sizeOfBalls) {
        for (int i=1; i<=sizeOfBalls; i++) {
            balls.add(i);
        }
    }

    public void mixBalls() {
        Collections.shuffle(balls);
    }

    public int pickWinningNumber() {
        return balls.remove(0);
    }
}
