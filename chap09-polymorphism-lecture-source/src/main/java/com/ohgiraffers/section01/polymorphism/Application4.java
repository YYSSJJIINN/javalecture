package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {
        /*수업목표. 다형성을 적용하여 리턴 타입으로 활용할 수 있다.*/

        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public Animal getRandomAnimal() {

        int random = (int) (Math.random() * 2);     //0.실수나 1. 소수인데 int형으로 변환이므로 0이거나 1이다.

        return random == 1 ? new Rabbit() : new Tiger();    //1이 나오면 토끼를, 0이 나오면 호랑이를 반환
        //런타임 때 어떤 게 올지 컴파일 타임일 땐 모른다.
    }
}
