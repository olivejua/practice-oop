package dev.olivejua.practiceoop.lotto;

public enum LottoRule {
    AllTheNumbers("AlltheNumbers", 45),
    WinningNumbers("WinningNumbers", 6),
    BonusNumbers("BonusNumbers", 1);

    private String sizeOf;
    private int size;

    LottoRule(String sizeOf, int size) {
        this.sizeOf = sizeOf;
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}
