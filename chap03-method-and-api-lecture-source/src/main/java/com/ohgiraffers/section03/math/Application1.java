package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */

        /* 필기. API(Application Programming Interface)란?
         *  API는 응용프로그램에서 사용할 수 있도록 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
         *  쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할 수 있도록 제공해놓은
         *  소스코드(클래스나 인터페이스)들을 의미한다.
         *  더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
         *  모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있다.
         * */

        /* 필기. java.lang.Math :
         *  Math 클래스는 수학에서 자주 사용하는 상수들과 함수 들을 미리 구현해놓은 클래스 이다. cuz, 우리가 직접하기엔 초보자니까 어려우니.
         *  모든 메소드는 static 메소드로 작성되어 있다.
         *  (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법이다.)
         * */

        /* 목차. 1. 절대값 출력*/  //+, - 상관없이 얼마나 가있는지 부호를 떼어낸 순수한 값
        System.out.println("-7의 절대값 : " + java.lang.Math.abs(-7));  //abs가 기울어져있다는건 static 메소드라는 뜻이다.
        System.out.println("-7의 절대값 : " + Math.abs(-7));  //abs가 기울어져있다는건 static 메소드라는 뜻이다.

        System.out.println(" -3.141592의 절대값 : " + Math.abs(-3.141592)); //자료형 선택할 때 f가 안붙어있으므로 double 선택해야함.

        /* 목차. 2. 최대/최소값 출력*/
        System.out.println("10과 20 중 더 작은 수 : " + Math.min(10, 20));
        System.out.println("10과 20 중 더 큰 수 : " + Math.max(10, 20));

        System.out.println("원주율 : " + Math.PI);

        /* 목차. 3. 난수 출력*/
        System.out.println("난수 발생기 : " + Math.random());    //0 이상, 1미만의 실수 값을 발생시킨다.

    }
}
