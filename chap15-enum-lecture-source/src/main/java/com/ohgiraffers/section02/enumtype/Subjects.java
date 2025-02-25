package com.ohgiraffers.section02.enumtype;

public enum Subjects {

    /*설명. 작성한 순서대로 정수 0부터 자동으로 리터럴이 부여된다.*/
    JAVA,           //0
    MYSQL,          //1
    JDBC,           //2
    HTML,           //3
    CSS,            //4
    JAVASCRIPT      //5
    ;               //열거 이후에 무언가 코드를 작성하려면 세미콜론을 찍어야 함.

    /*설명. 기본생성자 : 열거타입의 인스턴스를 생성할 수 있다.*/
    Subjects() {
        System.out.println("Subjects 열거타입의 기본생성자 호출됨.");
    }

    @Override
    public String toString() {
        return "**********" + this.name() + "**********";
    }
}
