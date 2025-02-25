package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하도록 문법적으로 강제화 할 수 있다.*/

        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";
//        monster1.hp = 200;

        /*필기. 선언한 필드대로 실제 heap area에 메모리 공간은 생성되어 있지만,
        * 이 영역을 소스 코드 상에서 직접 접근할 수 없고 public으로 선언된 메서드를 사용해 간접 접근해야 한다.
        * 이렇게 객체가 가지게 될 데이터에 대한 정보를 숨겨놓고 메서드라는 상호작용을 통해서만 데이터를 교환하는 것을
        * 캡슐화(encapsulation)이라고 한다.
        * */
        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*설명.
        * 캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
        * pbulic 메서드를 이용해 간접적으로 접근하여 사용할 수 있도록 만든 문법이자 기술이다.
        * 클래스 작성 시, 특수한 목적이 아닌 이상 캡슐화 작ㄴ업은 기본 원칙으로 삼고 있다.*/
    }
}
