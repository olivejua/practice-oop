package dev.olivejua.practiceoop.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VendingMachine implements Machine {
    private List<Integer> balls = new ArrayList<>();

    public WinningNumber getWinningNumber() {
        // 숫자들을 기계에 넣는다.
        putBalls();
        mixBalls();

        // 당첨번호를 구한다.
        int[] winningNumbers = fixBalls(LottoRule.SizeOfNumbers.Winning.getSize());

        // 보너스 번호를 구한다.
        int[] bonusNumbers = fixBalls(LottoRule.SizeOfNumbers.Bonus.getSize());

        return new WinningNumber(winningNumbers, bonusNumbers);
    }

    private int[] fixBalls(int size) {
        int[] results = new int[size];
        for (int i = 0; i< results.length; i++) {
            results[i] = extractNumber();
        }

        return results;
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
