package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

      /* 수업목표. 여러 개의 전달인자를 이용한 메서드 호출을 할 수 있다. */

        /* 목차. 1. 여러 개의 전달인자를 이용한 메서드 호출을 할 수 있다.*/
        Application4 app4 = new Application4();
        app4.printUserInfo( "홍길동", 16,   '남');   //정상호출

//        app4.printUserInfo( "홍길동", '남');    //전달 인자의 개수는 맞지만 순서가 잘못 되어서 오류 발생.

        /* 목차. 2. 변수에 저장된 값을 전달하여 호출*/
        String name = "유관순";
        int age = 15;
        char gender = '여';

        app4.printUserInfo( name, age, gender);
    }
    /**
     * 사용자의 이름, 나이, 성별 정보를 출력한다.
     * @param name 사용자의 이름. 문자열(String) 타입이어야 한다.
     * @param age 사용자의 나이, 정수(int) 타입이어야 한다.
     * @param gender  사용자의 성별. 문자(char) 타입이어야 하며, 보통 '남' 또는 '여'로 전달된다.
     *                이 매개변수는 'final'로 선언되어 값이 변경되지 않는다.
     * **/

    public void printUserInfo(String name, int age, final char gender){
        System.out.println("안녕하세요, " + name + "(" + age +")[" + gender + "]님.");
        System.out.println("당신의 이름은 " + name + "이고," +
                            " 나이는 " + age + "세 이며," +
                            " 성별은 " + gender + "입니다.");
    }
    /* 설명. Javadoc
     *  Java 코드에 대한 문서를 자동으로 생성할 수 있도록 도와주는 도구이자 주석의 형식을 말한다.
     *  Javadoc으로 작성된 주석은 다른 협업 멤버들이 IDE 상에서 쉽게 확인할 수 있고, HTML 문서로도 변환할 수 있다.
     *  범위 주석과 비슷하게 생겼으며 '/**'로 시작한다.
     *  @author   : 작성자 이름
     *  @version   : 코드 버전
     *  @param    : 메서드의 매개변수 설명
     *  @return   : 반환값 설명
     *  @throws   : 메서드가 발생시킬 수 있는 예외 설명
     * */
}
