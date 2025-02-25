package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. 다양한 타입의 예외를 multi(-tyr-catch) block을 이용해서 처리(핸들링)할 수 있다.*/

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

        /*설명. 예외 상황별로 catch 블럭을 예외 개수만큼 만들어서 처리할 수도 있다.*/
        } catch (PriceNegativeException e) {
            //ExceptionTest의 if문 1번에 걸려서 출력된다.
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage()); //에러메세지 출력
        } catch (MoneyNegativeException e) {
            //ExceptionTest의 if문 2번에 걸려서 출력된다.
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {

            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {

            System.out.println("finally 블록 동작함!");
        }
        System.out.println("프로그램을 종료합니다...");

        /*설명.
        * 디테일한 예외 상황별로 각각 처리 로직을 다르게 가져갈 수 있다.
        * 이 때, 주의할 점은 catch 블럭 위에서부터 아래로 차례대로 자신의 타입과 맞는 경우에만 동작하기 때문에
        * 상대적으로 상위 타입의 예외 타입을 위쪽으로 작성할 경우,
        * 하단에 작성한 코드가 동작하지 않을 수 있기 때문에 컴파일 에러를 발생시킨다.
        * */
    }
}
