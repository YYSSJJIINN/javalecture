package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표 : 오버플로우에 대해 이해할 수 있다. */

        /* 필기
        *  자료형 별 값의 최대 범위를 벗어나는 경우
        *  발생한 캐리(carry)를 버림 처리하고 부호 비트(sign bit)를 반전시켜 최소값으로 순환시킴.
        * */

        /* 목차. 1. 오버플로우 */
        byte num1 = 127;        // byte 자료형의 최대 저장 범위
        System.out.println("num1 = " + num1); // soutv 단축키

//        num1 = num1 + 1; // num1에 127+1을 넣으면 byte로 표현할 수 없기 때문에 int추천으로 알림뜬다.
        num1 ++;            // 1증가
        System.out.println("num1(overflow) = " + num1);

        /* 목차. 2. 언더플로우 */
        byte num2 = -128;
        System.out.println("num2 = " + num2); //soutv 자동완성 사용

        num2 --;            // 1감소
        System.out.println("num2(overflow) = " + num2); //soutv 자동완성 사용

        int firstNum = 1000000;         // 100만
        int secondNum = 700000;         // 70만
        int mul = firstNum * secondNum; // 700억

        System.out.println("mul = " + mul);
        
        /* 목차. 3. 해결방법 */ //용량이 더 큰 그릇 long 사용
        long longMul = (long) firstNum * secondNum;    // 자동형변환(뒤에서 배울 내용)
        System.out.println("longMul = " + longMul); // 안된다. 똑같다.
        /* 설명.
        *  오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리해보았다.
        *  그러나 이미 오버프롤우 처리된 결과를 가지고 변수에 담는 것이기 때문에 기존 결과와 별 차이가 없다.
        *  그럼 어떻게 해결할 것인가?
        *  계산이 처리되기 전에 long 타입으로 자료형을 변경해줘야 한다. (강제형변환 이용)
        *  강제 형변환은 바로 다음 파트에서 배울 내용이다.
        * */
    }
}
