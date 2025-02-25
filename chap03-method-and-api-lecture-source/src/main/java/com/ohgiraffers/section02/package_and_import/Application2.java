package com.ohgiraffers.section02.package_and_import; //패키지 선언문

import com.ohgiraffers.section01.method.Calculator;
import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 { //클래스선언문

    public static void main(String[] args) {

        /* 수업목표. 임포트에 대해 이해할 수 있다. */

        /* 필기. 임포트(import)란?
         *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
         *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         *   import는 package 선언문과 class 선언문 사이에 작성하며
         *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
         * */

        /* 목차. 1. 다른 패키지(파일경로)에 존재하는 non-static 메서드 호출하기*/
        Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        //com.ohgiraffers.section01.method.Calculator calc에서 패키지명을 지워서 Calculator calc만 남긴다.
        //import가 생겼으면 new와 Calculator(); 사이에 있는 것을 지워도 된다.

        int min = calc.minNumberOf(40, 10);
        System.out.println("min = " + min);     //10

        /* 목차. 2. 다른 패키지에 존재하는 static 메서드 호출하기 */ //특징 : new 안적어도 됌.
        int max = com.ohgiraffers.section01.method.Calculator.maxNumberOf(40, 10);
        System.out.println("max = " + max);     //40

        /* 목차. 3. static 메서드를 import static 구문을 사용해 직접 import해서 클래스 이름 없이 호출할 수 있다.*/
        int max2 = maxNumberOf(40, 10);
        System.out.println("max2 = " + max2);   //40
    }
}
