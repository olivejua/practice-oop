package dev.olivejua.practiceoop.lotto;

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
    void buyLottoManual() throws Exception {
        Store store = new LottoStore();
        OmrCard omrCard = store.getOmrCard();

        int[] expectedRegularNumbers = new int[] {1,2,3,4,5,6};

        omrCard.chooseNumbers(expectedRegularNumbers);

        Lotto lotto = store.buyLotto(omrCard);

        assertEquals(Lotto.class, lotto.getClass());
        assertEquals(expectedRegularNumbers, lotto.getNumberForm().getRegular());
        assertEquals(1, lotto.getNumberForm().getBonus().length);
    }
    
    @Test
    void cantBuyWithoutRightOrmCard() {
        Store store = new LottoStore();
        OmrCard blankOrmCard = store.getOmrCard();

        assertThrows(CantGiveLottoException.class,
                () -> store.buyLotto(blankOrmCard),
                "제대로 되지 않은 orm카드를 주면 로또를 못산다.");
    }
}
