package com.ohgiraffers.section01.init;

public class Car {

    //FIELD
    private String modelName;
    private int maxSpeed;

    //CONSTURCTOR

    public Car(String modelName, int maxSpeed) {        //매개변수 있는 생성자만 있음. 기본생성자는 누락.
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    //METHOD
    public void driveMaxSpeed() {
        System.out.println(modelName + "이(가) 최고 시속 " + maxSpeed + "km/h로 질주합니다.");
    }
}
