package dev.olivejua.practiceoop.lotto;

public class LottoStore implements Store {
    @Override
    public OmrCard getOmrCard() {
        return new OmrCard();
    }

    @Override
    public Lotto buyLotto(OmrCard omrCard) throws Exception {
        StoreMachine machine = new StoreMachine();

        int[] numbers = omrCard.getNumbersChosen()
                .orElseThrow(
                () -> new CantGiveLottoException("You can't buy a lotto with this card which is chosen the wrong numbers."));

        return new Lotto(numbers, machine.getOnlyBonusNumber());
    }
}
