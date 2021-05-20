package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MachineTest {

    @Test
    void extractWinningNumber() {
        Machine machine = new Machine();
        List<Integer> winningNumbers = machine.getWinningNumbers();

        assertEquals(LottoRule.WinningNumbers.getSize(), winningNumbers.size());
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
