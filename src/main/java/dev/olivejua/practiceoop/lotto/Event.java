package dev.olivejua.practiceoop.lotto;

public class Event {
    /**
     * 당첨번호를 구하고,
     * 당첨자를 호명한다.
     * 1등 ~ 5등
     */

    private LottoNumberForm winningNumber;

    private Event() {}

    public static Event holdEvent() {
        Event event = new Event();

        //당첨번호를 뽑는다. 진행할 때 필요한 로직
        Machine machine = new VendingMachine();
        event.winningNumber = machine.getLottoNumber();

        return event;
    }
}
