package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표. multi-catch block으로 동일한 레벨(형제타입)의 다른 타입의 예외를 하나의 catch 블럭으로 처리할 수 있다.*/

        ExceptionTest et = new ExceptionTest();

        try {
            //1. 상품 가격이 음수일 때
            //ExceptionTest의 if문 1번에서 걸려서 2번 3번은 출력 안된다.
//            et.checkEnoughMoney(-50000, 30000);

            //2. 잔고가 음수일 때
            //ExceptionTest의 if문 2번에서 걸려서 1번 3번은 출력 안된다.
            et.checkEnoughMoney(50000, -30000);

            //3. 돈이 부족한 경우
//                et.checkEnoughMoney(50000, 30000);

        /*설명. 예외 상황별로 catch 블럭을 예외 개수만큼 만들어서 처리할 수도 있다.
        * JDK 1.7 버전에서 추가된 구문으로,
        * 동일한 레벨의 다른 예외 타입을 하나의 catch 블럭으로 핸들링 할 수 있다.
        * -getMessage() : 예외 인스턴스가 생성될 때 전달한 메세지를 출력.
        * -getClass() : 예외 인스턴스의 타입을 풀패키지명과 함께 출력.
        * -e.printStackTrace() : 예외 클래스명 + 발생 위치 + 메세지 등을 stack 호출 역순을 빨간색 글자로 출력(로그).
        * */
        } catch (PriceNegativeException | MoneyNegativeException e) {
            //ExceptionTest의 if문 1번에 걸려서 출력된다.
            System.out.println(e.getClass() + " 발생");
            System.out.println(e.getMessage()); //에러메세지 출력

        } catch (NotEnoughMoneyException e) {

            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {

            System.out.println("finally 블록 동작함!");
        }
        System.out.println("프로그램을 종료합니다...");
    }
}
