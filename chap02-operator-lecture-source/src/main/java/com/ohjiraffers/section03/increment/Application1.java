package com.ohjiraffers.section03.increment;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 증감연산자에 대해 이해하고 활용할 수 있다. */

        /* 필기.
         *  증감연산자
         *  피연산자의 앞 or 뒤에 사용이 가능하다.
         *  '++' : 1 증가의 의미
         *  '--' : 1 감소의 의미
         * */
        
        /* 목차. 1. 증감 연산자를 단항으로만 사용 : 1 증가 또는 1 감소의 의미를 가짐*/
        int num = 20;
        System.out.println("num = " + num);     //20
        
        num++;      //num ++로 스페이스바 하나 넣어도 가능
        System.out.println("num = " + num);     //21
        
        ++num;
        System.out.println("num = " + num);     //22
        
        num--;
        System.out.println("num = " + num);     //21
        
        --num;
        System.out.println("num = " + num);     //20

        /* 목차. 2. 증감 연산자를 다른 연산자와 함께 사용 */
        /* 필기.
         *  주의사항!
         *  증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
         *  다른 연산자와 함께 사용할 때 증감 연산자의 의미     var:미지의 변수
         *  - '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
         *  - 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
         *  - '--var' : 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행함
         *  - 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
         *  ----------------------------------------------------------------------------------
         *  전위 연산자(Prefix Operator) vs. 후위 연산자(Postfix Operator)
         *  - 전위 연산자 : 증감 연산이 먼저 수행된 후, 나머지 연산 진행.
         *  - 후위 연산자 : 다른 연산을 먼저 수행한 후, 증감 연산을 진행.
         * */

        /* 설명. 후위 연산 사용:
        *  1. firstNum 값(20)을 먼저 사용해 20 *3을 계산 -> result1 = 60
        *  2. 계산 후 firstNum 값이 1 증가 -> firstNum = 21
        *  */
        int fristNum = 20;
        int result1 = fristNum++ * 3;

        System.out.println("result1 = " + result1);     //60
        System.out.println("fristNum = " + fristNum);   //21

        /* 설명. 전위 연산 사용
        *  1. secondNum 값을 먼저 1증가 (secondNum = 21)
        *  2. 증가된 값(21)을 사용하여 21 *3 계산 (result2 = 63)
        * */
        int secondNum = 20;
        int result2 = ++secondNum * 3;

        System.out.println("result2 = " + result2);     //63
        System.out.println("secondNum = " + secondNum); //21

        // Quiz
        int num1 = 10;
        int addNum = num1++;

        System.out.println("num1 = " + num1);       //11
        System.out.println("addNum = " + addNum);   //10
    }
}
