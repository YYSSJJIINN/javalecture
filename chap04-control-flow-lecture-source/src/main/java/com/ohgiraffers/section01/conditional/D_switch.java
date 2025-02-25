package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        /* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *  [switch문 표현식 #1]
         *  switch(비교할변수) {
         *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
         *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
         *      default : case에 모두 해당하지 않는 경우 실행할 구문; break;
         *  }
         *
         * 필기.
         *  [switch문 표현식 #2]
         *  switch(비교할변수) {
         *      case 비교값1 : 비교값1과 일치하는 경우 실행할 구문;
         *      break;
         *      case 비교값2 : 비교값2와 일치하는 경우 실행할 구문;
         *      break;
         *      default : case에 모두 해당하지 않는 경우 실행할 구문;
         *      break;
         *  }
         * */

        /* 필기.
         *  여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사하다.
         *  따라서 일부 호환이 가능하다.
         *  하지만, switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
         *  실수와 논리는 비교할 수 없다.
         *  또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
         *  case절에는 변수를 사용하지 못한다. (값만 비교 가능)
         *  또한, 문자열 비교는 jdk 1.7 이상부터 가능하다.
         * */

        /* 필기.
        *  정수 두 개와 연산 기호 문자(+, -, *, /, %)를 입력받아서
        *  두 정수의 연산 결과를 출력해보는 간단한 계산기 구현하기.
        * */

        //1. 사용자 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 :");
        int first = sc.nextInt();       //프라이머리 타입 받았다가 참조자료형 받으려면
        sc.nextLine();                  //버퍼 flush 비워줘야함

        System.out.print("연산 선택(+, -, %, /, % 5개 중 1택)");
        char op = sc.nextLine().charAt(0);
        sc.nextLine();                  //버퍼 flush 비워줘야함

        System.out.print("두 번째 정수 입력 :");
        int second = sc.nextInt();

        int result = 0;     //연산 결과 저장용 변수 선언 및 초기화

        //2. 연산
        switch (op) {
            case '+' :
                result = first + second; break;
            case '-' :
                result = first - second; break;
            case '*' :
                result = first * second; break;
            case '/' :
                result = first / second; break;
            case '%' :
                result = first % second; break;
            default :
                System.out.println("말을 안듣는군요...");
                break;
        }

        //3. 연산 결과 출력
        System.out.println("계산결과: " + first + " " + op + " " + second + " = " +result);
    }

    public void testSwitchVendingMachine(){

        /* 수업목표. switch문 내의 break문에 대해 흐름을 이해하고 적용할 수 있다. */
        /* 필기. switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트 */
        /* 필기.
         *  1. JDK 1.7 이상부터 switch문을 이용하여 문자열을 비교할 수 있다.
         *  2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
         * */

        // 1. 안내문구 출력 및 사용자 입력 받기
        System.out.println("====== OhGiraffers vending machine ======");
        System.out.println("  사이다   콜라   환타   박카스  핫식스  ");
        System.out.println("=========================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("음료를 선택해주세요 : ");
        String selectedDrink = sc.nextLine();

        int price = 0;      //음료 가격을 저장할 변수 선언 및 초기화

        // 2. 사용자가 고른 음료에 따라 투입할 가격(price)을 지정.
        switch (selectedDrink) {
            case "사이다":
                price = 1000;
                System.out.println("사이다의 가격은 " + price + "원 입니다.");
                break;
            case "콜라":
                price = 1200;
                System.out.println("콜라의 가격은 " + price + "원 입니다.");
            case "환타":
                price = 1300;
                System.out.println("환타의 가격은 " + price + "원 입니다.");
                break;
            case "박카스":
                price = 1500;
                System.out.println("박카스의 가격은 " + price + "원 입니다.");
                break;
            case "핫식스":
                price = 2500;
                System.out.println("핫식스의 가격은 " + price + "원 입니다.");
                break;
            default:
                System.out.println("그런 음료는 없습니다 손님.");
                break;
        }

        System.out.println(price + "원을 투입해주세요...");

    }
}
