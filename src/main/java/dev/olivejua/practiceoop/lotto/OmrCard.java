package dev.olivejua.practiceoop.lotto;

import static dev.olivejua.practiceoop.lotto.LottoRule.*;

public class OmrCard {
    private int[] numbersChosen = new int[SizeOfNumbers.REGULAR.getSize()];

    public boolean isFilledForm() throws WrongOrmCardException {
        for (int number : numbersChosen) {
            if (number == 0 || number > SizeOfNumbers.Total.getSize()) {
                throw new WrongOrmCardException("You chose wrong numbers in this card.");
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
}
