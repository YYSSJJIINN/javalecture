package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표. 다형성을 적용해 메서드의 매개변수로 활용할 수 있다.*/

        //Animal 타입의 토끼와 호랑이 인스턴스 생성.
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        //토끼와 호랑이를 전달인자로 전달하여 feed() 메서드 호출
        Application3 app3 = new Application3();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();      //다회용
        Tiger animal4 = new Tiger();

        app3.feed(animal3);     //묵시적 형변환 가능
        app3.feed(animal4);

        app3.feed((Animal)animal3);     //암시적 형변환 가능
        app3.feed((Animal)animal4);

        app3.feed(new Rabbit());        //일회용
        app3.feed(new Tiger());

        /*설명.다형성을 적용할 수 없었다면
        * 호랑이에게 먹이를 주는 메서드와 토끼에게 먹이를 주는 메서드 feed()를 각각 작성하는 귀찮음이 생겼을 것이다.
        * feedToTiger() + feedToRabbit()
        * */
    }

    public void feed(Animal animal) {
        animal.eat();
    }
}
