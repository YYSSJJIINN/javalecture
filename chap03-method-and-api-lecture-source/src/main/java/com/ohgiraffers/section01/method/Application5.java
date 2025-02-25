package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 메서드 리턴에 대해 이해할 수 있다. */

        /* 필기 return(반환)이란?
        *  모든 메서드 내부에는 return; 구문이 존재한다.
        *  void 리턴 타입의 메서드일 경우, return;을 명시적으로 작성하지 않아도
        *  컴파일러가 자동으로 가장 마지막 줄에 해당 구문을 추가해준다. -> 3과 4번 아래에 직접 리턴 적어도 적기전과 차이가 없는 것이 증명이다.
        *  return은 현재 메서드를 강제 종료시키고, 자신을 호출한 구문으로 다시 돌아가는 명령어다.
        * */

        System.out.println("main() 호출됨...");    //1번

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 종료됨...");    //4번

        return;
    }

    public void testMethod(){
        System.out.println("testMethod() 호출됨...");      //2번
        /* 설명.
        *  return; 구문은 컴파일러에 의해 자동으로 추가 되는 구문으로,
        *  가장 마지막 줄에 작성해야 하고, 그렇지 않을 경우 return; 이후의 구문은 모두 컴파일 에러를 발생시킨다.=빨간 밑줄
        *  이를 '문법적으로 구속했다.' 또는 '문법적으로 강제했다.' 라고 표현한다. -> 리턴 밑에는 아무것도 못 적게 강제하자~라고 개발자들이 약속
        * */
        return;
//        System.out.println("testMethod() 종료됨...");      //3번

    }
}
