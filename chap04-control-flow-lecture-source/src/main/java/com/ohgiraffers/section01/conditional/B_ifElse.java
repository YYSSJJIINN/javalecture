package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {

        /* 수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *  [if-else문 표현식]
         *  if(조건식) {
         *      조건식이 true일 때 실행할 명령문;
         *  } else {
         *      조건식이 false일 때 실행할 명령문;
         *  }
         * */

        /* 필기.
         *  if문은 조건식의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
         *  조건식의 결과 값이 거짓(false)이면  else { } 안에 있는 코드를 실행한다.
         * */

        //1. 사용자 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력해주세요 :");
        int num = sc.nextInt();

        //2. 짝수/홀수 판단  둘 중 하나는 if문이고, 다른하나는 else문으로
        if (num % 2 == 1) {
            //2-1. 홀수인가?
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            //2-2. 짝수인가?
            System.out.println("입력하신 정수는 짝수입니다.");
        }

        //3. 조건 상관 없이 출력되는 구문
        System.out.println("프로그램을 종료합니다...");
    }

    public void testNestedIfElseStatement() {

        /* 수업목표. 중첩된 if-else문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기. 중첩된 if-else 문 실행 흐름 확인 */
        /* 설명. if-else 문 안에서 또 다른 조건을 사용하여 if-else 문을 사용할 수 있다. */

        /* 필기.
         *  숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
         *  음수이면 "입력하신 숫자는 음수 입니다." 출력
         *  단, 0이면 "0입니다" 라고 출력하세요
         *  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
         * */

        //1. 사용자 입력 담기=스캐너 사용
        Scanner sc = new  Scanner(System.in);

        System.out.print("정수를 하나 입력해주세요 :");
        int num = sc.nextInt();

        //2. 입력 정수 판단
        if (num !=0) {
            //2-1. 0이 아닌 경우
            if (num > 0) {
                //2-1-1. 양수인 경우
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                //2-1-2. 음수인 경우
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
             //2-2. 0인 경우
             System.out.println("0입니다.");
        }
        //3. 조건 관계 없이 출력되는 구문
        System.out.println("프로그램을 종료합니다.");
    }
}
