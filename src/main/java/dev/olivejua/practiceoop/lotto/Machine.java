package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List<Integer> balls = new ArrayList<>();

    public void putBalls() {
        for (int i=1; i<=45; i++) {
            balls.add(i);
        }
    }
}
