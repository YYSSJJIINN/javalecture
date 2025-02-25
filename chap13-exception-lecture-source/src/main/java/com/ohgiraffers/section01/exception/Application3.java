package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표. try-catch 블럭을 이용해 예외처리를 구현할 수 있다.*/

        /*목차. 2. try-catch 블럭 이용*/
        /*목차. 2-2. 예외 발생의 경우*/

        ExceptionTest et = new ExceptionTest();

        /*설명. 예외 발생 가능성이 존재하는 메서드들은 try 블럭 안에 작성.*/
        try {
            et.checkEnoughMoney(50000, 10000);
            System.out.println("상품 구입 가능합니다.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
