package com.ohgiraffers.section02.looping;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();

//        a.testSimpleForStatement();     //단독 for문 흐름 확인용 메서드 호출
//        a.testForExample1();        //반복문을 사용해야 하는 이유 - 예제1
//        a.testForExample2();        //반복문을 사용해야 하는 이유 - 예제2
//        a.testForExample3();        //반복문을 사용해야 하는 이유 - 예제3
//        a.testForExample4();        //반복문을 사용해야 하는 이유 - 예제4
//        a.printSimpleGugudan();       //반복문을 일상 생활 속에서 사용하는 예제(규칙 찾기)

        B_nestedFor b = new B_nestedFor();

        //중첩 반복문을 사용하는 예제
        b.printGugudanForTwoToNine();

        C_while c = new C_while();

        //단독 while문 흐름 확인용 메서드 호출
        c.testSimpleWhileStatement();
        c.testWhileExample1();

        D_doWhile d = new D_doWhile();

        d.testDoWhileExample1();
    }
}
