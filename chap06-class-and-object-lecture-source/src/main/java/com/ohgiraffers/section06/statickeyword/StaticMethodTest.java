package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    // FIELD
    private int count;

    //CONSTRUCTOR

    //METHOD
    public void nonStaticMehod() {

        this.count ++;
        System.out.println("NonStaticMehod 호출됨...");
    }

    public static void staticMethod() {

        /*설명. 인스턴스를 생성하지 않고 사용하는 메서드이기 때문에 this에는 주소값이 들어갈 수 없다.*/
//        this.count ++;      //static과 this의 시점이 맞지 않음.
        System.out.println("staticMethod 호출됨...");
    }
}

