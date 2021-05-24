package dev.olivejua.practiceoop.lotto;

public class LottoNumberForm {
    private int[] regular;
    private int[] bonus;

    public LottoNumberForm(int[] winningNumbers, int[] bonusNumber) {
        this.regular = winningNumbers;
        this.bonus = bonusNumber;
    }

    public int[] getRegular() {
        return regular;
    }

    public int[] getBonus() {
        return bonus;
    }
}
