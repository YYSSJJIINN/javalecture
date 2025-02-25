package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다.(1) */
        /* 필기. 필드에 올바르지 않는 값이 들어가도 통제가 불가능해진다. */
        
        //1번 몬스터 인스턴스 생성.(자바의 API중 스캐너였던 것)
        Monster monster1 = new Monster();
        //몬스터의 이름과 체력 정보 입력.
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        //2번 몬스터 인스턴스 생성.
        Monster monster2 = new Monster();
        //몬스터의 이름과 체력 정보 입력
        monster2.name = "뿌꾸";
        monster2.hp = -200;     //뿌꾸의 체력을 음수로 지정.

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        
        //3번 몬스터 인스턴스 생성.
        Monster monster3 = new Monster();
        //몬스터의 이름과 체력 정보 입력
        monster3.name = "드라큘라";
        monster3.setHp(2000);       //필드값에 직접 접근하지 않고 메서드를 통해 monster3의 hp데이터를 조작.

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
        
        //4번 몬스터 인스턴스 생성.
        Monster monster4 = new Monster();
        //몬스터의 이름과 체력정보 입력
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-2000);      //음수값을 입력.

        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
    }
}
