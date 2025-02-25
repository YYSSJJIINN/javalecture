package com.ohgiraffers.section03.branching;

public class Application {

    public static void main(String[] args) {

        //break문 확인 메서드
        A_break a = new A_break();

//        a.testSimpleBreakStatement();
//        a.testSimpleBreakStatement2();

        B_continue b = new B_continue();

//        b.testSimpleContinueStatement();    //continue문 메서드 확인용 호출
        b.testSimpleContinueStatement2();
    }
}
