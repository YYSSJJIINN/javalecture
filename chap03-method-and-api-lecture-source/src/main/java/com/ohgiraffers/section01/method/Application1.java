package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 메서드의 호출 흐름에 대해 이해할 수 있다. */

        /* 필기. 메서드(method)란?
        *  메서드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        *  자세한 메서드 사용법은 객체 챕터에서 다룰 예정이므로 현재는 호출 흐름에 대해 이야기할 수 있도록 집중하자.
        * */

        System.out.println("main() 메서드 호출됨...");


        /* 목차. 1. main() 메서드 외부에 methodA()라는 메서드를 추가한다.*/
        /* 목차. 2. 작성한 methodA()를 호출하는 부분을 작성한다.*/

        /* 설명. 메서드 호출 방법:
        *  1. 클래스명 변수명 = new 클래스명();    //객체생성
        *  2. 변수명. 메서드명();                  //메서드 호출
        * */
        Application1 app1 = new Application1();         //Application1 app1은 일종의 빵이고, new~는
        app1.methodA();

        System.out.println("main() 메서드 종료됨...");
    }

    public static void methodA() {
        System.out.println("methodA() 메서드 호출됨...");
        methodB();
        System.out.println("methodA() 메서드 종료됨...");
    }

    public static void methodB() {
        System.out.println("methodB() 메서드 호출됨...");
        methodC();
        System.out.println("methodB() 메서드 종료됨...");
    }

    public static void methodC() {
        System.out.println("methodC() 메서드 호출됨...");
        System.out.println("methodC() 메서드 종료됨...");
    }
}
