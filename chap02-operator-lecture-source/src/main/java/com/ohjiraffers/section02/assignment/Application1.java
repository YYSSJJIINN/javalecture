package com.ohjiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다. */

        /* 필기.
         *  대입연산자와 산술 복합 대입 연산자
         *  '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
         *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
         *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
         *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
         *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
         *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
         * */
        
        int num = 12;
        System.out.println("num = " + num);     //12
        
        //  3 증가
        num = num +3;
        System.out.println("num = " + num);     //15
        
        num += 3;                               //num = num +3; 과 같은 연산
        System.out.println("num = " + num);     //18
        
        num -= 5;
        System.out.println("num = " + num);     //13

        num *= 3;
        System.out.println("num = " + num);     //39

        num /= 5;
        System.out.println("num = " + num);     //7
        
        num %= 4;
        System.out.println("num = " + num);     //3

        /* 주의사항:
        *  산술 복합 대입 연산자의 작성 순서에 대해 주의해야 한다.
        *  산술 대입 연산자가 아닌  '-5'가 들어간 것이다.*/
        num =- 5;
        System.out.println("num = " + num);     //-5  순서를 바꾸면 컴퓨터는 연산이 아니라 대입을 해버림
    }
}
