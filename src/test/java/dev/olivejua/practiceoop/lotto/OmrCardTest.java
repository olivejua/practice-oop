package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OmrCardTest {

    @Test
    void isFilledForm1_X() {
        OmrCard blankOmrCard = new OmrCard();
        assertThrows(WrongOrmCardException.class, blankOmrCard::isFilledForm);
    }

    @Test
    void isFilledForm2_X() {
        OmrCard omrCard = new OmrCard();
        assertThrows(WrongOrmCardException.class, () -> omrCard.chooseNumbers(new int[] {1,2,3,4,5,6,7}));
    }

    @Test
    void isFilledForm_O() {
        try {
            OmrCard omrCard = new OmrCard();
            omrCard.chooseNumbers(new int[] {1,2,3,4,5,6});
            assertTrue(omrCard.isFilledForm());

        } catch (WrongOrmCardException e) {
            System.out.println(e.getMessage());
        }
    }
}
