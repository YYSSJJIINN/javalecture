package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 깡총 깡총 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~ 끼익~");
    }

    public void jump() {    //부모클래스에서 물려받은 것 외에 자신만 할 수 있는 것.
        System.out.println("토끼가 포식자를 피해 깡총 점프합니다.");
    }
}
