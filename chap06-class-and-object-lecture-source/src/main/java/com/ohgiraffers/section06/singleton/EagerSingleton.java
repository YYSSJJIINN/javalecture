package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    //FIELD
    /*설명. 클래스가 초기화되는 시점에서 인스턴스를 바로 생성한다.*/
    private static EagerSingleton eager = new EagerSingleton();     //매개변수가 없는 기본 생성자

    //CONSTRUCTOR
    /*설명. 싱글턴 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하지 못하도록 제한한다*/
    private EagerSingleton() {}



    //METHOD
    /*설명. public 접근 제한자를 설정해 인스턴스(주소)를 반환하도록 한다.*/
    public static EagerSingleton getInstance() {
        return eager;
    }
}
