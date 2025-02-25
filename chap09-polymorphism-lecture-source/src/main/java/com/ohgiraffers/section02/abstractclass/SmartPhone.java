package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    /*설명. SmartPhone 클래스는 Product 추상클래스를 상속받아 구현한다.
    * extend 키워드로 상속받을 때, 두 개 이상의 클래스는 상속받지 못하여(이중상속 x -> 모호성 제거
    *)
    * 추가 클래스가 가지는 추상 메서드를 반드시 오버라이딩 해야한다.(문법적 강제성 및 구속력 부여)*/
    public SmartPhone() {

    }

    @Override
    public void abstractMethod() {
        System.out.println("[SmartPhone] Product 클래스의 불완전한 abstractMethod() 오버라이딩...");
    }

    public void printSmartPhone() {
        System.out.println("[SmartPhone] printSmartPhone() 메서드 됨...");
    }
}
