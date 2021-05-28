package dev.olivejua.practiceoop.lotto;

public class LottoNumberForm {
    private int[] regular;
    private int[] bonus;

    public LottoNumberForm(int[] winningNumbers, int[] bonusNumber) {
        this.regular = winningNumbers;
        this.bonus = bonusNumber;
    }

    public void updateNumbers(int[] regular, int[] bonus) {
        //TODO validate regular numbers
        this.regular = regular;
        this.bonus = bonus;
    }

    public int[] getRegular() {
        return regular;
    }

    public int[] getBonus() {
        return bonus;
    }
}
