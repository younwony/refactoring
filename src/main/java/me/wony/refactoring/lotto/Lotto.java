package me.wony.refactoring.lotto;

import java.util.*;

/**
 *  # 로또!
 *
 *  # 기능
 *  1. getLotto() - 로또 번호 6개 뽑기
 *  2. getLottoOne() - 로또 번호 1개 뽑기
 */
public class Lotto {

    public static Set<Integer> lotto = new LinkedHashSet<>();

    /**
     * 로또 번호 6개 뽑기
     */
    public static void getLotto(){
        setLotto();
        for (Integer integer : lotto) {
            System.out.print(integer + " ");
        }
    }

    /**
     * 로또 번호 하나 뽑기
     */
    public static void getLottoOne(){
        System.out.println(getLottoNumber());
    }


    /* 로또 6개 세팅 */
    private static void setLotto(){
        while(lotto.size() < 6){
            lotto.add(getLottoNumber());
        }
        setLottoAsc();
    }

    /* 번호 하나 뽑기 */
    private static int getLottoNumber(){
        return (int) (Math.random() * 44) + 1;
    }

    /* 로또 오름차순 정렬 */
    private static void setLottoAsc(){
        ArrayList<Integer> lottoList = new ArrayList<>(lotto);
        Collections.sort(lottoList);
        lotto.clear();
        for (Integer integer : lottoList) {
            lotto.add(integer);
        }

    }

}
