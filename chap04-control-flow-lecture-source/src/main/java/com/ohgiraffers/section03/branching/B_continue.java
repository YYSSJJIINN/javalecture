package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement() {

        /* 수업목표. continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *  continue문은 반복문 내에서 사용한다.
         *  해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
         *  일반적으로 if(조건식) { continue; } 처럼 사용된다.
         *  보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
         * */

        /* 필기. 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력(=공통배수=공배수) */
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {    //i를 4로 나눴을 때 나머지가 0이면서 5로 나눴을 때도 나머지가 0인 수
                //4와 5의 공배수인 경우
                System.out.println("[v]4와 5의 공배수임 : " + i);
            } else {
                //4와 5의 공배수가 아닌 경우
                continue;
//                System.out.println("[x]4와 5의 공배수가 아님 : " + i);
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }

    public void testSimpleContinueStatement2() {

        /* 수업목표. 중첩 반복문 내 continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기. continue는 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 건너뛴다. */

        /* 필기.
         *  구구단 2~9단까지 출력
         *  단 각 단의 수가 짝수인 경우 출력을 생략한다.(su of dan)
         * */

        for (int dan = 2; dan <= 9; dan++) {        //2단부터 9단까지, 한단씩 늘어가며
            System.out.println("======" + dan + "단 ======");

            for (int su = 1; su <= 9; su++) {       //1부터 9까지 곱한다, 하나씩 수를 늘려가며
                if ( su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }
}
