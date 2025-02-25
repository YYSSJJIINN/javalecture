package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        System.out.println("[Car] 기본생성자 호출됨...");
    }

    //자동차라는 객체는 기본적으로 달리는 기능을 수행할 수 있다
    public void run() {

        runningStatus = true;
        System.out.println("[Car] 자동차가 달립니다.");
    }

    //자동차는 주행중인 상태일 때 기본적인 경적을 울리는 기능을 수행할 수 있다.
    public void soundHorn() {

        if(isRunning()) {
            //주행중일 때
            System.out.println("[Car] 빵! 빵!");
        } else {
            //주행중이 아닐때
            System.out.println("[Car] 주행중이 아닐 때에는 경적을 울릴 수 없습니다!");
        }
    }

    //자동차는 기본적으로 멈추는 기능을 수행할 수 있다.
    public void stop() {

        runningStatus = false;
        System.out.println("[Car] 자동차가 멈춥니다.");
    }

    //자동차의 현재 주행 상태를 반환하는 기능을 수행할 수 있다.
    //처음에는 private으로, 나중에 FireCar작성 시 protected로 수정해야 하는 상황이 발생할 예정이다.
//    private boolean isRunning() {
    protected boolean isRunning() {
        return runningStatus;
    }
}
