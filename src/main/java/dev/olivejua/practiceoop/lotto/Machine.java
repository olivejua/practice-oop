package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
    private List<Integer> balls = new ArrayList<>();

    public WinningNumber getWinningNumber() {
        // 숫자들을 기계에 넣는다.
        putBalls();
        mixBalls();

        // 당첨번호를 구한다.
        int[] winningNumbers = new int[LottoRule.SizeOfNumbers.Winning.getSize()];
        for (int i = 0; i< winningNumbers.length; i++) {
            winningNumbers[i] = extractNumber();
        }

        // 보너스 번호를 구한다.
        int bonusNumber = extractNumber();

        return new WinningNumber(winningNumbers, bonusNumber);
    }

    private void putBalls() {
        for (int i = 1; i<= LottoRule.SizeOfNumbers.Total.getSize(); i++) {
            balls.add(i);
        }
    }

    private void mixBalls() {
        Collections.shuffle(balls);
    }

    private int extractNumber() {
        return balls.remove(0);
    }
}
