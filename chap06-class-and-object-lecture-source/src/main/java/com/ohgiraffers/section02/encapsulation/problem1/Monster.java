package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    /*목차. 1. 필드로 몬스터의 이름과 체력이라는 정보를 저장할 공간을 선언한다.*/
    String name;    //몬스터 이름
    int hp;         //몬스터 체력(Health Power)

    //==========================================

    /*목차. 2. setHp() 메서드를 생성해서 필드에 간접 접근하기.
    * 매개변수parameter인 hp에 음수가 인자로 전달되면 안되기 때문에 hp가 양수인 경우에만 허용하도록 하고,
    * 음수인 경우 기본값의 의미로 0을 저장할 로직을 구현한다.
    *
    * */
    public void setHp(int hp) {

        /*설명. this:
        * this는 인스턴스가 생성되었을 때, 자신의 주소를 저장하는 레퍼런스 변수다.
        * 지역변수와 전역변수의 이름이 동일한 경우, 지역변수를 우선적으로 접근하기 때문에
        * 전역변수에 접근하기 위해 아래와 같이 'this.'을 명시해야 한다.
        * - 전역변수 : 클래스 상단에 필드로서 선언된 hp    처음부터 지역이 아니라 전역에서 찾고 싶을 때 this.을 사용해서 찾는다.
        * - 지역변수 : setHp() 메서드의 매개변수로 선언된 hp    좁은 범위인 지역변수에서부터 찾고, 없으면 전역변수로 옮겨가서 찾는다.
        * */
        if(hp > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 입력하신 값으로 변경합니다.");
            this.hp = hp;
        } else {
            System.out.println("0 보다 작거나 같은 값이 입력되어 몬스터의 체력을 0의로 변경합니다.");
            this.hp = 0;


        }
    }
}
