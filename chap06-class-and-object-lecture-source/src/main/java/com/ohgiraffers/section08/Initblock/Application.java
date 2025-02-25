package com.ohgiraffers.section08.Initblock;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */
        /* 필기.
         *  초기화 블럭
         *  복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분된다.
         *  1. 인스턴스 초기화 블럭      //내가 new 연산자 사용해서 인스턴스 사용할때마다 실행
         *    : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 된다.
         *      인스턴스를 호출하는 시점마다 호출이 된다.
         *      인스턴스변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어쓴다.
         *  {
         *      초기화 내용 작성
         *  }
         *  2. 정적 초기화 블럭
         *    : 클래스가 로드될 때 한 번 동작한다.
         *      정적 필드를 초기화하며, 인스턴스변수는 초기화하지 못한다.
         *  static {
         *      초기화 내용 작성
         *  }
         *  */

        /*목차. 0. 인스턴스 생성*/
        Product product = new Product();        //product의 기본생성자를 확인중

        /*목차. 1. 자료형 별 기본값으로 초기화된 인스턴스의 필드값 확인*/
//        System.out.println(product.getInfo());

        /*목차. 2. 명시적 초기화로 인스턴스의 필드값 확인*/
        //명시적 초기값을 Product클래스의 필드변수에 적용하면 기본값을 명시적 초기값이 덮어 쓰게 된다.
        System.out.println(product.getInfo());

        /*목차. 3. 초기화 블럭으로 필드 초기화 후 인스턴스의 필드값 확인*/
        System.out.println(product.getInfo());

        /*목차. 4. 매개변수 있는 생성자를 호출해서 필드값 초기화한 후 인스턴스의 필드값 확인*/
        Product product2 = new Product("대륙폰", 120000, "샤옴미");
        System.out.println(product2.getInfo());
    }
}
