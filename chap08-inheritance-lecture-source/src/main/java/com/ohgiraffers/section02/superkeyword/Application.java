package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        /*수업목표. super와 super()에 대해 이해할 수 있다.*/
        /* 필기.
         *  super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
         *          함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수로
         *          자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스 변수이다.
         *  super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
         *            부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
         *            구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
         *            호출할 수 있도록 한 구문이다.
         * */

        Product product1 = new Product();
        System.out.println(product1.getInfo());     //JVM의 기본값으로 초기화 됨.

        Product product2 = new Product("5-1227", "삼성", "갤럭시폴드6", 2229700, new Date());//매개변수 있는 생성자 호출
        System.out.println(product2.getInfo());

        Computer computer1 = new Computer();
        System.out.println(computer1.getInfo());    //JVM의 기본값으로 부모 필드까지 모두 초기화됨.

        Computer computer2 = new Computer("스냅드래곤8-Gen3", 256, 12, "안드로이드");
        System.out.println(computer2.getInfo());    //부모 필드는 JVM기본값으로, 자신의 필드는 명시한 초기값으로 초기화됨.

        Computer computer3 = new Computer("5-1227", "삼성", "갤럭시폴드6", 2229700, new Date(),
                "스냅드래곤8-Gen3", 256, 12, "안드로이드");
        System.out.println(computer3.getInfo());    //부모 필드 및 자신의 필드 모두 명시한 초기값으로 초기화 됨.
    }
}
