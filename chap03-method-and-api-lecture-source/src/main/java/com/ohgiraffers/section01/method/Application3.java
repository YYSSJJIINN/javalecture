package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다. */

        /* 필기.
         *  전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
         *  지금까지 우리가 배운 변수는 지역변수에 해당한다.
         * */

        /* 필기.
         *  변수의 종류 ( 기준 : scope 범위, 관찰) :
         *   1. 지역변수
         *   2. 매개변수
         *   3. 전역변수(필드)
         *   4. 클래스(static)변수
         * */

        /* 필기.
         *  지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
         *  다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         *  이 때 전달하는 값을 전달인자(argument)라고 부르고,
         *  메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         * */

        Application3 app3 = new Application3();

        /* 목차. 1. 전달인자로 값을 전달하는 테스트*/
        /* 설명. 호출하려는 메서드의 매개변수 선언부에 미리 선언해둔 자료형과 그 개수, 순서가 일치하게 전달인자를 넣어 호출해야 한다.*/
        app3.printYourAge(20);              //올바른 예시    //20부분이 argument라고 한다. 실제로 던진 값(리터럴)   //. 온점은 참조연산자라고 한다.
//        app3.printYourAge("20");          //정의된 매개변수는 int 타입이지만, 전달된 인가는 String 타입이라서 호출 시 에러 발생.
//        app3.printYourAge(10, 20);        //정의된 int 타입 매개변수는 1개이지만, 2개의 int 타입 리터럴을 전달인자로 전달해서 에러발생.
//        app3.printYourAge();              //정의된 int 타입 매개변수는 1개이지만, 어떠한 전달인자도 전달하지 않아서 에러발생.

        /*목차. 2. 변수에 저장한 값 전달 테스트*/
        int yourAge = 15;
        app3.printYourAge(yourAge);     //(yourAge) 안에 15라는 정수 리터럴이 담겨있는 상태

        byte byteAge = 15;
        app3.printYourAge(byteAge);     //자동형변환을 이용했다. ()안의 값은 int형으로 예정 되어 있었는데 바이트에서 인트로는 작은 것에서 큰것으로 가는 자동형변환이다.

        long longAge = 15;
//        app3.printYourAge(longAge);   //이번에는 자동 형변환이 안됨.
        app3.printYourAge((int) longAge);   //강제 형변환을 이용

        app3.printYourAge(yourAge + 1);

        app3.printYourName("홍길동");
    }

    public void printYourAge(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다._");    //int age 부분이 parameter라고 한다. 설계도의 것.
    }

    public void printYourName(String name) {
        System.out.println("안녕하세요 " + name + "님");

        /**
         * 사용자의 나이를 출력한다.
         *
         * <p>이 메서드는 매개변수로 전달받은 나이를 콘솔에 출력한다. 호출 시 정수형(int) 나이를 전달해야 하며,
         * 다른 자료형이나 매개변수를 전달할 경우 컴파일 오류가 발생한다.</p>
         *
         * @param age 출력할 나이. 정수형(int) 값을 전달해야 한다.
         *            예를 들어, {@code printYourAge(30)}이라고 호출하면 "당신의 나이는 30세 입니다."라는 메시지가 출력된다.
         * @since 1.0
         * */
    }
}
