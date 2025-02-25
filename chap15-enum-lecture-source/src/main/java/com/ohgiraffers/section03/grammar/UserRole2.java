package com.ohgiraffers.section03.grammar;

public enum UserRole2 {

    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    /*설명.
    * 각각의 상수 요소들이 특별한 값을 가지도록 할 수도 있다.
    * 이 때 필드에 상수를 하나 선언한 후, 매개변수 있는 생성자로 이를 초기화 해주는 구문이 반드시 필요하다.
    * (실제로 매개변수 있는 생성자를 호출하기 때문)
    * enum 상수의 괄호 안에 넣은 값이 실제로 해당 생성자 쪽으로 전달되며 enum 인스턴스가 생성된다.
    * 물론 이렇게 생성된 인스턴스도 여전히 싱글턴으로 관리된다.
    * */
    private final String desc;  //이미 final로 수정불가능이기에 setter는 없다.

    UserRole2(String desc) {    //매개변수 있는 생성자가 전달받을 수 있는 필드는 private final String desc;

        System.out.println("[UserRole2] 매개변수 있는 생성자 호출됨 : " + desc);
        this.desc = desc;
    }

    /*설명. 상수 필드 desc의 getter 메서드*/
    public String getDesc() {
        return desc;
    }
}
