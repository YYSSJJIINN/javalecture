package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement() {

        /* 수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *  break문은 반복문 내에서 사용한다.
         *  해당 반복문을 빠져 나올 때 사용하며, 반복문의 조건문 판단 결과와 상관 없이 반복문을 빠져나올 때 사용한다.
         *  일반적으로 if(조건식) { break; } 처럼 사용된다.
         *  단, switch문은 반복문이 아니지만 예외적으로 사용된다.
         * */

        /*필기. break문과 while문을 이용해 1~100까지의 합 구하기.*/
        int sum = 0;
        int i = 1;
        //for문 쓰면 간단히 해결되지만 수업을 위해 while사용
        while (true) {      //true 넣으면 무한루프
            sum += 1;

            if (i == 100) {     //만약 i가 100에 도달했다면
                break;          //빠져나가라
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public void testSimpleBreakStatement2() {

        /* 수업목표. 중첩 반복문 내 break문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기. break는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 멈춘다. */

        /* 필기.
         *  구구단 2~9단까지 출력
         *  단 각 단의 수가 5보다 큰 경우는 출력을 생략한다.
         * */

        for (int dan = 2; dan <= 9; dan++) {        //2단부터 9단까지, 한단씩 늘어가며
            System.out.println("======" + dan + "단 ======");
            for (int su = 1; su <= 9; su++) {       //1부터 9까지 곱한다, 하나씩 수를 늘려가며
                if ( su > 5) {
                    break;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }
}
