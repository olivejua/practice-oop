package dev.olivejua.practiceoop.lotto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OmrCardTest {

    @Test
    void chooseNumber_X() {
        OmrCard omrCard = new OmrCard();
        assertThrows(WrongOrmCardException.class, () -> omrCard.chooseNumbers(new int[] {1,2,3,4,5,6,7}));
    }

    @Test
    void isFilledForm_O() {
        try {
            //given
            OmrCard omrCard = new OmrCard();
            int[] expectedNumbers = {1, 2, 3, 4, 5, 6};

            //when
            omrCard.chooseNumbers(expectedNumbers);
            int[] actualNumbers = omrCard.getNumbersChosen().orElse(null);

            //then
            assertNotNull(actualNumbers);
            assertEquals(expectedNumbers, actualNumbers);

        } catch (WrongOrmCardException e) {
            System.out.println(e.getMessage());
        }
    }
}
