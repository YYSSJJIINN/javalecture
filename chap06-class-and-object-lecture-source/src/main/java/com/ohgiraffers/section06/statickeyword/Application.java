package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다. */
        /* 필기.
         *  static
         *  : 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
         *    인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
         *    여러 인스턴스가 공유해서 사용할 목적의 공간이다.
         *    하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
         *    명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하자.
         *    의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다.
         * */
        
        /*목차. 1. static 키워드를 필드에서 사용하기*/
        
        //인스턴스 생성
        StaticFieldTest sft1 = new StaticFieldTest();

        //인스턴스 생성 후, 두 필드가 가지고 있는 값 출력
        System.out.println("sft1.getNonStaticCount() = " + sft1.getNonStaticCount());
        System.out.println("sft1.getStaticCount() = " + sft1.getStaticCount());

        //두 필드의 값을 각각 1씩 증가시킨 후 다시 출력하여 확인
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("sft1.getNonStaticCount() = " + sft1.getNonStaticCount());
        System.out.println("sft1.getStaticCount() = " + sft1.getStaticCount());

        System.out.println("=============================================================");

        //인스턴스 생성
        StaticFieldTest sft2 = new StaticFieldTest();

        //인스턴스 생성 후, 두 필드가 가지고 있는 값 출력
        System.out.println("sft2.getNonStaticCount() = " + sft2.getNonStaticCount());
        System.out.println("sft2.getStaticCount() = " + sft2.getStaticCount());

        //두 필드의 값을 각각 1씩 증가시킨 후 다시 출력하여 확인
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("sft2.getNonStaticCount() = " + sft2.getNonStaticCount());
        System.out.println("sft2.getStaticCount() = " + sft2.getStaticCount());
    }

    /*목차. 2. static 메서드 확인*/
    /*목차. 2-1. non-static 메서드 호출*/
    StaticMethodTest smt = new StaticMethodTest();

//    smt.nonStaticMethod();
//
//    /*목차. 2-2. static 메서드 호출*/
//
//    smt.staticMethod();                  //권장되지 않는 방법
//    StaticMethodTest.staticmethod();        //권장되는 방법

}
