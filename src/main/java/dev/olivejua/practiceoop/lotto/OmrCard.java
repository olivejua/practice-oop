package dev.olivejua.practiceoop.lotto;

import java.util.Optional;

import static dev.olivejua.practiceoop.lotto.LottoRule.*;

public class OmrCard {
    private int[] numbersChosen = new int[SizeOfNumbers.REGULAR.getSize()];

    private boolean isFilledForm() {
        for (int number : numbersChosen) {
            if (number == 0 || number > SizeOfNumbers.Total.getSize()) {
                return false;
            }
        }

        return true;
    }

    public void chooseNumbers(int[] numbersChosen) throws WrongOrmCardException {
        if (numbersChosen.length != SizeOfNumbers.REGULAR.getSize()) {
            throw new WrongOrmCardException("You chose more or less numbers than the rule.");
        }

        this.numbersChosen = numbersChosen;
    }

    public Optional<int[]> getNumbersChosen() {
        return Optional.ofNullable(isFilledForm() ? numbersChosen : null);
    }
}
