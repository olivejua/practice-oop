package dev.olivejua.practiceoop.lotto;

public class StoreMachine extends ExtractingNumberMachine {

    public int[] getOnlyBonusNumber() {
        int[] results = new int[LottoRule.SizeOfNumbers.Bonus.getSize()];

        for (int i=0; i<results.length; i++) {
            results[i] = extractNumber();
        }

        return results;
    }

    @Override
    public LottoNumberForm getLottoNumber() {
        // 당첨번호를 구한다.
        int[] winningNumbers = fixBalls(LottoRule.SizeOfNumbers.REGULAR.getSize());

        // 보너스 번호를 구한다.
        int[] bonusNumbers = fixBalls(LottoRule.SizeOfNumbers.Bonus.getSize());

        return new LottoNumberForm(winningNumbers, bonusNumbers);
    }
}
