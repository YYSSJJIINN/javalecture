package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {    //main이 sayHello를 호출함

        /* 수업목표. 메서드 반환값(return value)을 이해하고 활용할 수 있다. */

        System.out.println("main() 호출됨...");        //1

        Application6 app6 = new Application6();
        app6. sayHello();

        String returnedString = app6.sayHello();    //String ReturnedString은 반환형(hello world)을 받아놓을 준비를 해둔 것이다.
                                                    //app6.sayHello()의 위치에 hello world가 온다.
                                                    //내가 메인메서드를 가지고 함수를 짤 때, 자료값이 없으면 다른 곳(다른 함수)에서 얻어와야한다.
        System.out.println("returnedString = " + returnedString);

        System.out.println(app6.sayHello());

        System.out.println("main() 종료됨...");        //3
    }

    public String sayHello(){
        return "hello world";       //String형 반환해보기     //2
    }
}
