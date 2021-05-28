package dev.olivejua.practiceoop.lotto;

public class VendingMachine extends ExtractingNumberMachine {

    public LottoNumberForm getLottoNumber() {
        // 당첨번호를 구한다.
        int[] winningNumbers = fixBalls(LottoRule.SizeOfNumbers.REGULAR.getSize());

        // 보너스 번호를 구한다.
        int[] bonusNumbers = fixBalls(LottoRule.SizeOfNumbers.Bonus.getSize());

        return new LottoNumberForm(winningNumbers, bonusNumbers);
    }

}
