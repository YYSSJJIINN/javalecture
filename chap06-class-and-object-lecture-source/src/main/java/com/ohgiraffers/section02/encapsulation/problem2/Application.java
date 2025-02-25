package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */
        /* 설명.
         *  필드의 이름이나 자료형을 변경할 때 사용한 쪽 모두 코드를 수정해야 하는 경우가 생긴다.
         *  즉, 작은 변경이 사용하는 다른 여러 곳의 변경도 함께 초래하게 된다.
         * */

        //몬스터 3마리 추가.
        Monster monster1 = new Monster();
        monster1.name = "삼색고양이";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "고등어";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "턱시도";
        monster3.hp = 400;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);
        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);

        /*설명. 이제 Monster의 name 필드를 kinds로 수정해보자.
        *직접 name 필드에 접근하는 코드는 모두 컴파일 에러가 발생하게 된다.
        * 즉, Monster 클래스의 일부 구조를 변경한 것 뿐인데 사용처에서는 모두 수정을 해야 하는 책임과 부담이 생긴 것이다.
        * 이것은 유지보수에 막대한 악영향을 미친다.
        * */
    }
}
