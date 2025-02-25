package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 사냥할 때만 뛰는 맹수입니다. 어슬렁~");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흥~");
    }

    public void bite() {        //부모에게서 물려 받은 것 외에 혼자만 할 수 있는 것.
        System.out.println("호랑이가 사냥감을 물어뜯습니다.");
    }
}
