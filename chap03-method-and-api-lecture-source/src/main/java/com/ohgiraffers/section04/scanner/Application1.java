package com.ohgiraffers.section04.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */

        /* 설명.
         *  콘솔 화면에 값을 입력 받아 출력해보기:
         *  이런 어려운 기능 또한 미리 JDK를 설치하면 손쉽게 사용할 수 있도록 구현 해 놓았다.
         * */

        /* 목차. 1. Scanner 객체 생성*/
        //원래는 이렇게 Scanner 객체를 만드는 것이 정석이다
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        //java.lang 패키지는 생략 가능.
//        java.util.Scanner sc = new java.util.Scanner(System.in);

        //다른 패키지에 있는 클래스 사용 시 패키지명을 생략하기 위해 import 구문 작성.
        Scanner sc = new java.util.Scanner(System.in);  //패키지(java.util.)생략 후 import

        /* 목차. 2. 자료형 별 값 입력받기*/
        /*설명.
        * 입력받을 때 출력될 안내 문구는 별도로 출력해주지 않기 때문에 우리가 직접 작성해야 한다.
        * 참고로 print()와 println()의 차이인 'ln'은 '줄바꿈'이라는 것에 차이가 있다.
        * 다음 줄에 입력을 대기시키는 것이 아닌, 줄바꿈을 하지 않은 책 입력받게 하기 위해 print()를 사용할 것이다.*/

        /* 목차. 2-1. 문자열 입력받기*/
        System.out.print("이름을 입력하세요 :");

        // nextLine(): 입력 받은 값을 문자열로 반환
        String name = sc.nextLine();
        System.out.print("당신이 입력하신 이름은" + name + "입니다.");

        /* 목차. 2-2. 정수형 리터럴 입력받기*/
        System.out.print("나이를 입력하세요 : ");

        // nextInt(): 입력받은 값을 int형으로 반환.
          int age = sc.nextInt();
          System.out.println("당신이 입력하신 나이는 " + age + "입니다.");

        /*설명. nextByte() 및 nextSHort()는 생략할 것이다.
        * 매개변수로 사용할 수 있는 radix(기수)는 진법을 지정할 수 있다.
        * 숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생한다.
        * int 범위를 초과한 겂을 입력받게 되면 역시 InputMisamatchException이 발생한다.
        * Exception은 나중에 챕터에서 다룰 예정이지만, 쉽게 표현하자면 우리가 알고 있는 '에터'의 개념으로 생각하고 넘어가자
        * */

        System.out.print("당신의 연봉을 입력해주세요 : ");

        //nextLong(): 입력받은 값을 long형으로 반환
        long money = sc.nextLong();
        System.out.println("당신이 입력하신 연봉은" + money + "원 입니다.");

        /* 목차. 2-3. 실수형 리터럴 입력받기*/
        System.out.print("당신의 키를 입력해주세요 : ");

        float height = sc.nextFloat();
        System.out.println("당신의 키는 " + height + "cm 입니다.");

        /* 목차. 2-4. 논리형 리터럴 입력받기*/
        System.out.print("true(참)와 false(거짓) 중 하나를 입력해주세요 : ");

        boolean isTrue = sc.nextBoolean();
        System.out.println("당신이 입력하신 논리값은 " + isTrue + "입니다.");

        sc.nextLine();      //이 구문을 써 줘야 뒤의 목차 2-5가 예외 발생 없이 정상 동작한다. (원리는 뒤에서...)

        /* 목차. 2-5. 문자형 리터럴 입력받기*/
        System.out.print("아무 문자나 입력해주세요 : ");

//        String str = sc.nextLine();
//        char ch = str.charAt(0);
        char ch = sc.nextLine().charAt(4);
        /* 설명.
         *  아쉽게도 문자를 직접 입력 받는 기능을 제공하지는 않는다.
         *  따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
         *  java.lang.String에 charAt(int index)를 사용한다.
         *  index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 형으로 반환해주는 기능을 한다.
         *  index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용되는 방식이다.
         *  만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        System.out.println("당신이 입력하신 문자는 " + ch + "입니다.");
    }
}
