package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 인터페이스(interface)에 대해 이해할 수 있다. */
        /* 필기.
         *  인터페이스(interface)
         *  여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
         *  추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
         * */

        /* 필기.
         *  인터페이스의 사용 목적
         *  1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다. (표준화)
         *  2. 자바의 단일상속의 단점을 극복할 수 있다. (다중 상속)
         *
         * 설명.
         *  참고로 인터페이스는 정말 많은 의미로 사용된다.
         *  지금 학습하는 인터페이스 말고도 클래스에 작성한 public method 또한
         *  객체들이 상호작용을 하기 위한 통로의 의미로 인터페이스라고 불린다.
         * */

        /* 설명. 추상클래스와 인터페이스의 특징과 차이점도 면접 질문에서 단골 질문으로 등장하니 잘 정리해두자 */

        //인터페이스는 생성자를 가질 수 없기 때문에 인스턴스를 생성할 수 없다.
//        InterProduct interProduct = new InterProduct();

        //레퍼런스 타입으로만 사용 가능하다.
        InterProduct interProduct = new Product();

        /*설명
        * Product 클래스는 InterProduct 인터페이스를 구현(implements) 하였다.
        * 이 때, Product클래스를 InterProduct 인터페이스의 '구현체'라고 부른다.
        * */

        //인터페이스의 추상 메서드를 오버라이딩한 클래스의 메서드로 동적바인딩 되어 호출됨.
        interProduct.nonStaticMethod();     //다형성이 적용되어 인터페이스의  추상메서드로 이동함.
        interProduct.abstMethod();

        //상수 필드 접근도 인스턴스 필요 없이 '인터페이스명.필드명'으로 접근 가능함.
        System.out.println(InterProduct.MAX_NIM);
        System.out.println(InterProduct.MIN_NUM);

    }
}
