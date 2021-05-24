package dev.olivejua.practiceoop.lotto;

public class LottoStore implements Store {
    @Override
    public OmrCard getOmrCard() {
        return new OmrCard();
    }

    @Override
    public Lotto buyLotto(OmrCard omrCard){
//        omrCard.isFilledForm();

        return new Lotto();
    }
}
