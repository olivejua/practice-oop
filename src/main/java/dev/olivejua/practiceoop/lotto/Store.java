package dev.olivejua.practiceoop.lotto;

public interface Store {
    OmrCard getOmrCard();

    Lotto buyLotto(OmrCard omrCard);
}
