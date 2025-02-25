package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)
        //3가지 예외 처리 클래스를 선언하여 예외 처리에 대한 책임을 모두 호출부에 위임.
            throws PriceNegativeException, NotEnoughMoneyException, MoneyNegativeException {
//            throws NegativeException, NotEnoughMoneyException {
//            throws Exception {

        /*설명. 1. 상품 가격이 음수일 경우*/
        if (price < 0)
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다."); //매개변수가 스트링형태

        /*설명. 2. 잔고가 음수일 경우*/
        if (money < 0)
            throw new MoneyNegativeException("잔고는 음수일 수 없습니다.");

        /*설명. 3. 돈이 부족한 경우*/
        if (money < price)
            throw new NotEnoughMoneyException("잔고보다 상품의 가격이 더 높습니다.");

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑하세요~");
    }
}
