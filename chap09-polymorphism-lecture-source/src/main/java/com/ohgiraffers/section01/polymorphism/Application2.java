package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /*수업목표. 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속적으로 처리할 수 있다.*/

        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /*설명. Animal클래스가 가지는 cry() 메서드를 오버라이딩한 메서드 호출 시, 동적 바인딩이 일어난다.
        * 아래 반복문 내 실행 명령어는 "토끼 울고, 그 다음 호랑이 울고, 그 다음 토끼 울고..."의 느낌이 아니라
        * "그냥 동물들 다 울어라~"라는 느낌으로 가져가면 된다.
        * */
        for(int i = 0; i< animals.length; i++) {
            animals[i].cry();
        }

        /*설명.
        * 각 클래스 별 고유기능(메서드)을 동작시키기 위해서는 Down-casting을 명시적으로 해줘야 하는데,
        * 이 때 ClassCastException을 방지하기 위해 instanceof 연산자와 조건문을 활용할 수 있다.
        * */
        for(int i = 0; i< animals.length; i++) {

            if(animals[i] instanceof Rabbit) {      //animals의 i번째 인덱스를 꺼내본다.
                //동물이 토끼일 때
                ((Rabbit) animals[i]).jump();
            } else if(animals[i] instanceof Tiger) {
                //동물이 호랑이일 때
                ((Tiger) animals[i]).bite();
            } else {
                //동물이 토끼나 호랑이가 아닐 때
                System.out.println("이 동물은 토끼나 호랑이가 아닙니다.");
            }
        }
    }
}
