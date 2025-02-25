package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다.*/

        /*설명.
        * 람다식을 사용하기 위해 인터페이스(@함수적 인터페이스) 하나에 오직 한 개의 추상메서드를 작성할 수 있기 때문에
        * 관리해야 할 인터페이스의 개수가기하급수적으로 증가할 수 있다.
        * 이 때, 내부 인터페이스를 활용하는 방법으로 이를 극복할 수 있다.
        * */

//        OuterInterface.Addition add = (c, d) -> { return c + d; };
        OuterInterface.Addition add = (c, d) -> c + d;
        //한줄인데 return문일때는 중괄호 없어질 수 있다.

//        OuterInterface.Substraction sub = (x, y) -> { return x - y; };
        OuterInterface.Substraction sub = (x, y) -> x - y;

        OuterInterface.Multiplication mul = (a, b) -> a * b;
        OuterInterface.Division div = (q, w) -> {return q/w;};

        System.out.println(add.addTwoNumber(20, 10));
        System.out.println(sub.subTwoNumber(20, 10));
        System.out.println(mul.mulTwoNumber(20, 10));
        System.out.println(div.divTwoNumber(20, 10));



    }
}
