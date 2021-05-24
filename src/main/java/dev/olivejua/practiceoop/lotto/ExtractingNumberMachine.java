package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ExtractingNumberMachine implements Machine {

    private List<Integer> balls = new ArrayList<>();

    protected int[] fixBalls(int size) {
        int[] results = new int[size];
        for (int i = 0; i< results.length; i++) {
            results[i] = extractNumber();
        }

        return results;
    }

    protected void putBalls() {
        for (int i = 1; i<= LottoRule.SizeOfNumbers.Total.getSize(); i++) {
            balls.add(i);
        }
    }

    protected void mixBalls() {
        Collections.shuffle(balls);
    }

    protected int extractNumber() {
        return balls.remove(0);
    }
}
