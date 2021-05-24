package dev.olivejua.practiceoop.lotto;

public class LottoRule {
    enum SizeOfNumbers {
        Total(45),
        REGULAR(6),
        Bonus(1);

        private final int SIZE;

        SizeOfNumbers(int size) {
            this.SIZE = size;
        }

        public int getSize() {
            return this.SIZE;
        }
    }
}
