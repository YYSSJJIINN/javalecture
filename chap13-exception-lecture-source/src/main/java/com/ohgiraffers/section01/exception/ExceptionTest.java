package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("지금 가지고 계신 잔고는 " + money + "원 입니다");

        if (money >= price) {    //만약 내가 가지고 있는 돈이 상품의 가격 보다 많거나 같으면 물건 구매 가능
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            /*설명.
             * 강제로 예외 발생시킴.
             * 예외를 발생 시키고 메서드 시그니처부에 throws구문을 추가한다.
             * 예외를 발생시킨 쪽에서는 throws로 예외에 대한 책임을 위임해서
             * 해당 예외에 대한 처리를 강제화 시킬 수 있다.(컴파일 에러를 발생시킴)*/
            throw new Exception();
        }
            System.out.println("즐거운 쇼핑 하세요~");
    }
}
