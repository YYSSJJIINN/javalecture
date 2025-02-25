package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

    /* 수업 목표. 여러가지 값(literal 리터럴)의 형태를 출력할 수 있다. */

    /* 목차. 1. 숫자 형태의 값 */
    //정수 형태의 값 출력
    System.out.println(123);
    //실수 형태의 값 출력
    System.out.println(1.23);

    /* 목차. 2. 문자 형태의 값 */
    System.out.println('a');        // 문자 형태의 값은 홑따옴표(single quotation)으로 감싸줘야 함.
//    System.out.println('ab');     // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//    System.out.println('');       // 어떠한 문자도 입력하지 않은 경우에도 에러가 발생한다
    System.out.println(' ');        // 공백(whitespace)은 허용.
    System.out.println('3');        // 숫자 리터럴이지만, 홀따옴표로 감싸면 컴퓨터는 이를 문자 '1'로 인식한다.

    /* 목차. 3. 문자열(String) 형태의 값 */
    System.out.println("안녕하세요?");       // 문자열은 문자 여러개가 나열된 형태로, 쌍따옴표(double-quotation)으로 감싸줘야 함.
        System.out.println("a");
        System.out.println("ab");
        System.out.println("");     //빨간색은 에러, 노란색은 경고. 빈 문자열(empty string)
        System.out.println(" ");
        System.out.println("123");

    /* 목차. 4. 논리(logical) 형태의 값 */
    System.out.println(true);
    System.out.println(false);

    System.out.println("l I 1 ㅣ |");

    }
}
