package me.wony.refactoring.calculator;

/**
 * 구구단
 *
 */
public class Calculator {

    /**
     * GuguDan ( 1 ~ 9 단) 전체 출력
     */
    public static void gugudan(){
        for(int i = 2; i <= 9; i++){
            gugudan(i);
        }
    }

    /**
     * GuGuDan 특정 단(number) 출력
     * @param number 출력 단
     */
    public static void gugudan(int number){
        for(int i = 1; i <= 9; i++){
            System.out.println(number + " x " + i + " = " + times(number, i));
        }
    }

    private static int times(int i, int j){
        return i*j;
    }
}
