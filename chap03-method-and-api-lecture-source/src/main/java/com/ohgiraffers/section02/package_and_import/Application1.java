package com.ohgiraffers.section02.package_and_import;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다.*/

        /* 필기. 패키지(package)란?
         *  서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음(그룹)으로 단위를 구성하는 것을 말한다.
         *  같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수도 있다.
         *  왜냐하면 클래스명은 원래 기본적으로 '패키지명 + 클래스명'을 모두 포함한 개념이기 때문이다.
         *  예) com.ohgiraffers.section01.method.Calculator <-- 이게 클래스명이다.
         *  지금까지 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
         *  따라서 서로 다른 패키지에 존재하는 클래스를 사용하는 경우에는 클래스명 앞에 패키지명을 명시해서 '풀 클래스명'으로 사용해야 한다.
         * */

        //파일경로=패키지 파일명=클래스 확장자=.java

        /* 목차. 1. 다른 패키지(파일경로)에 존재하는 non-static 메서드 호출하기*/
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();

        int min = calc.minNumberOf(40, 10);
        System.out.println("min = " + min);     //10
        
        /* 목차. 2. 다른 패키지에 존재하는 static 메서드 호출하기 */ //특징 : new 안적어도 됌.
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(40, 10);
        System.out.println("max = " + max);     //40
        
    }
}
