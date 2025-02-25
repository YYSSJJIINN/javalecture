package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        /* 설명.
         *  사전에 정의되어 있는 Exception의 종류는 굉장히 많이 있다.
         *  하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않는다.
         *  간단한 조건문등으로 처리가 가능하기 때문에 따로 강제화 하지 않았다.
         * */

        /* 설명.
         *  사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다.
         *  extends Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.
         *  여기서는 사용자 정의의 예외처리로 아까 만들었는 프로그램을 조금 더 업그레이드를 시켜보자
         * */

        ExceptionTest et = new ExceptionTest();

        /*설명. 정상적인 프로그램의 흐름을 컨트롤 하기 위해서는 try-catch 블럭으로 감싸줘야 비정상적인 종료를 예방할 수 있다.*/
        try {
            //1. 상품 가격이 음수일 때
//            et.checkEnoughMoney(-50000, 30000);

            //2. 잔고가 음수일 때
//            et.checkEnoughMoney(50000, -30000);

            //3. 돈이 부족한 경우
            et.checkEnoughMoney(50000, 30000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
