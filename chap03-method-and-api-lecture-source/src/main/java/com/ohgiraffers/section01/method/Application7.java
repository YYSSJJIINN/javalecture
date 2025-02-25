package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다.*/

        /* 필기. 매개변수와 리턴값 복합 활용:
        *  매개변수도 존재하고 리턴값도 존재하는 메서드를 이용해 간단한 계산기 만들기.
        * */

        int num1 = 15;
        int num2 = 25;

        Application7 app7 = new Application7();

        int result = app7.addTwoIntegers(num1, num2);       //두 줄로 표현
        System.out.println(result);                         //result를 항상 재사용 할 수 있다.

        System.out.println("두 개의 정수를 더한 결과 = " + app7.addTwoIntegers(num1, num2));  //한 줄로 표현 //재사용 불가
        System.out.println("두 개의 정수를 뺀 결과 = " + app7.minusTwoIntegers(num1, num2));
        System.out.println("두 개의 정수를 곱한 결과 = " + app7.multiplyTwoIntegers(num1, num2));
        System.out.println("두 개의 정수를 나눈 결과 = " + app7.divideTwoIntegers(num1, num2));

    }
    //덧셈만 잘 하는 메서드 만들기      //void함수 사용하면 돌아갈때 가지고 가는 내용물이 없는데
                                        //내가 원하는 것은 두 변수의 합 40이므로 int를 넣어준다.

    public int addTwoIntegers(int firstInteger, int secondInteger) {
        return firstInteger + secondInteger;
    }

    public int minusTwoIntegers(int firstInteger, int secondInteger) {
        return firstInteger - secondInteger;
    }

    public int multiplyTwoIntegers(int firstInteger, int secondInteger) {       //int는 반환형
        return firstInteger * secondInteger;        //반환값
    }

    public int divideTwoIntegers(int firstInteger, int secondInteger) {
        return firstInteger / secondInteger;
    }

    public int subTwoIntegers(int num1, int num2) {
        return num1 - num2;
    }
}
