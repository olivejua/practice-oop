package dev.olivejua.practiceoop.lotto;

public class Lotto {

    LottoNumberForm numberForm;

    public Lotto(int[] regularNumbers, int[] bonusNumbers) {
        numberForm = new LottoNumberForm(regularNumbers, bonusNumbers);
    }

    public LottoNumberForm getNumberForm() {
        return numberForm;
    }

    public int[] getRegularNumbers() {
        return numberForm.getRegular();
    }

    public int[] getBonusNumbers() {
        return numberForm.getBonus();
    }
}
