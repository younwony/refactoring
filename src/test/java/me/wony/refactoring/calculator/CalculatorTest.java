package me.wony.refactoring.calculator;

import org.junit.jupiter.api.Test;

import static me.wony.refactoring.calculator.Calculator.gugudan;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void 구구단_전부(){
        gugudan();
    }

    @Test
    void 구구단_지정(){
        gugudan(4);
    }

}