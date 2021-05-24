package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoreTest {

    @Test
    void getOmrCard() {
        Store store = new LottoStore();

        assertEquals(OmrCard.class, store.getOmrCard().getClass());
    }

    @Test
    void buyLottoManual() {
        Store store = new LottoStore();
        OmrCard omrCard = store.getOmrCard();
        Lotto lotto = store.buyLotto(omrCard);

        assertEquals(Lotto.class, lotto.getClass());
    }
    
    // TODO 다음 구현은 여기부터
    @Test
    @Disabled
    void cantBuyWithoutRightOrmCard() {
        Store store = new LottoStore();
        OmrCard blankOrmCard = store.getOmrCard();

        assertThrows(WrongOrmCardException.class,
                () -> store.buyLotto(blankOrmCard),
                "제대로 되지 않은 orm카드를 주면 로또를 못산다.");
    }
}
