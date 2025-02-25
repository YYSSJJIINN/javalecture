package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car();      //한 명이 한꺼번에 두 대 이상 운전은 못하니까 상수선언 final

    //시동을 건다
    public void startUp() {
        car.startUp();      //시동을 건다
    }

    //엑셀을 밟는다
    public void stepAccelerator() {
        car.go();      //앞으로 가라
    }

    //브레이크를 밟는다
    public void stepBrake() {
        car.stop();         //멈춰라
    }

    //시동을 끈다
    public void turnOff() {
        car.turnOff();
    }
}
