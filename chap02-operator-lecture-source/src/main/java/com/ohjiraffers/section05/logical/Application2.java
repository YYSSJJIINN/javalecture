package com.ohjiraffers.section05.logical;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */

        /* 필기.
         *  논리 연산자의 우선순위와 활용
         *  논리 AND 연산자와 논리 OR 연산자의 우선선위
         *  && : 11순위
         *  || : 12순위
         *  논리 AND 연산자 우선순위가 논리 OR 연산자 우선순위보다 높다
         * */

        /* 목차. 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("num1이 1부터 100 사이의 값인지 확인 = " + (num1 >= 1 && num1 <= 100));       //t   (1=<num1) && (num1=<100)이 아니군..

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println("ch1이 영문자 대문자인지 확인 : " + (ch1 >= 65 && ch1 <= 90));            //t   (ch1 = (char) ch1)인줄 알았는데..
        System.out.println("ch1이 영문자 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));          //t

        /* 목차. 3. 대소문자 상관 없이 영문자 y인지 확인 */
        char ch2 = 'Y';
        char ch3 = 'y';

        /*대소비교 금지(<, <=, >, >=). = =만 사용*/
        System.out.println("ch2가 영문자인지 확인 : " + (ch2 == 'Y' || ch2 == 'y'));
        System.out.println("ch3가 영문자인지 확인 : " + (ch3 == 89 || ch3 == 121));

        /* 목차. 4. 영문자인지 확인 */
        char ch4 = 'd';
        char ch5 = 'D';
        /*HINT!
        (65이상 AND 90이하)대문자이거나OR(97이상 AND 122이하)소문자이거나 둘중 하나가 참이면 맞다*/
        System.out.println("ch4가 영문자인지 확인 = " + ((ch4>= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z')));  //(ch4 >= 97) || (ch4 =< 122)인줄알았는데
        System.out.println("ch5가 영문자인지 확인 = " + ((ch5>= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));     //(ch5 >= 65) || (ch5 =< 90)인줄알았는데
    }
}
