package com.ohgiraffers.section03.grammar;

public enum UserRole1 {

    /*설명. Enum 타입은 상수 하나하나가 모두 인스턴스화(싱글턴)된다.*/
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    /*설명. 기본생성자를 가질 수 있다.
    * default와 private 접근 제어자를 사용할 수 있지만, 외부에서 호출은 불가능하다. (=묵시적으로 private)
    * enum 타입은 고정된 상수들의 집합으로, 런타임이 아닌 컴파일 시 모든 값이 결정되어 있어야 한다.
    * 그렇지 않으면 다른 클래스에서 enum 타입에 접근해 동적으로 생성자를 호출하며 어떤 값을 전달해 줄 수 없기 때문이다.
    * 단, 생성자를 가질 때 열거형 상수 선언 마지막에 세미 콜론을 붙여줘야 한다. (컴파일에러 발생함)
    * */
    UserRole1() {
        System.out.println("[UserRole1] 기본생성자 호출됨: " + this.name());
    }

    /*설명. 원하는 경우 메서드도 정의해서 사용할 수 있다.*/
    public String nameToLowerCase() {
        return this.name().toLowerCase();
    }
}
