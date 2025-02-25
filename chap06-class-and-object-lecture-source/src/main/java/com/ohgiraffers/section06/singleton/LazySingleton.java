package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    //FIELD
    /*설명. 클래스가 초기화되는 시점에서는 정적 필드를 선언만 해두고, 우선 null로 초기화된다.*/
    private static LazySingleton lazy;     //매개변수가 없는 기본 생성자

    //CONSTRUCTOR
    /*설명. 싱글턴 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하지 못하도록 제한한다*/
    private LazySingleton() {}



    //METHOD
    /*설명. public 접근 제한자를 설정해 인스턴스(주소)를 반환하도록 한다.*/
    public static LazySingleton getInstance() {

        //인스턴스를 생성한 적이 없는 경우, 인스턴스를 생성해서 반환하고
        if(lazy == null) {
            lazy = new LazySingleton();
        }
        //생성한 인스턴스가 이미 존재하는 경우, 만들어둔 인스턴스를 반환하면 된다.
        return lazy;
    }
}
