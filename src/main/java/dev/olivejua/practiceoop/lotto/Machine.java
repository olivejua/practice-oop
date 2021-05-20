package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
    private List<Integer> balls = new ArrayList<>();

    public List<Integer> getWinningNumbers() {
        putBalls();
        mixBalls();

        List<Integer> winningNumbers = new ArrayList<>();
        for (int i=0; i<LottoRule.WinningNumbers.getSize(); i++) {
            winningNumbers.add(extractWinningNumber());
        }

        return winningNumbers;
    }

    private void putBalls() {
        for (int i=1; i<=LottoRule.AllTheNumbers.getSize(); i++) {
            balls.add(i);
        }
    }

    private void mixBalls() {
        Collections.shuffle(balls);
    }

    private int extractWinningNumber() {
        return balls.remove(0);
    }
}
