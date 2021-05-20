package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MachineTest {

    @Test
    void getWinningNumber() {
        Machine machine = new Machine();
        WinningNumber winningNumber = machine.getWinningNumber();

        assertEquals(LottoRule.SizeOfNumbers.Winning.getSize(), winningNumber.getRegular().length);
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
