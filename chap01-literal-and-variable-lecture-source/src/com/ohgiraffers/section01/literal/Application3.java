package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {
        System.out.println("=========== 10과 20의 사칙연산 결과 ===========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("=========== 10과 20의 사칙연산 결과 보기 좋게 출력 ===========");
        System.out.println("10과 20의 합 : " + (10 + 20));		//주의 : 괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 차 : " + (10 - 20));		//문자열은 마이너스 연산이 불가능하기에 앞에서 생성된 문자열과 마이너스 연산이 불가하다. (반드시 괄호 사용)
        System.out.println("10과 20의 곱 : " + (10 * 20));		//아래 부터는 동일한 방식이다.
        System.out.println("10과 20을 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20을 나누기 한 나머지 : " + (10 % 20));

        /* 문제 : 출력결과가 "반지름의 길이가 3인 원의 넓이는 xxx입니다."
           조건 : 원주율(파이)은 3.14로 계산할 것."
        *  원의 넓이 = 반지름이 r일때, pi*r*r이다. */
        System.out.println("반지름의 길이가 3인 원의 넓이는" + (3.14 * 3 * 3) + "입니다."); //문자열 사이에 있는 곱셈뿐인 숫자는
                                                                                            // 굳이 ()표시가 필요는 없지만 코드의 가독성을 높이기 위해 입력해준다.

    }
}
