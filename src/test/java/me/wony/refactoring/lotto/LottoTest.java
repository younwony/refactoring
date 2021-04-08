package me.wony.refactoring.lotto;

import org.junit.jupiter.api.Test;

import static me.wony.refactoring.lotto.Lotto.getLotto;
import static me.wony.refactoring.lotto.Lotto.getLottoOne;

class LottoTest {

    @Test
    void 로또뽑기(){
        getLotto();
    }

    @Test
    void 숫자_하나뽑기(){
        getLottoOne();
    }

}