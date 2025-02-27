package com.ohgiraffers.section03.dto;

public class MemberDTO {

    /* 설명.
     *  취급하려고 하는 회원정보를 고려해서 필드를 우선 작성해본다.
     *  주로 화면(UI) 혹은 데이터베이스 테이블을 기준으로 한다.
     *  회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화여부)를 관리할 것이다.
     *  값 객체(VO : Value Object)가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
     *  DTO클래스를 만들기 위해서는 모든 필드를 private로 만든다.
     * */

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActive;

    /* 설명.
     *  이렇게 필드만 만들고 나면 private로 접근이 제한되었기 때문에 각 영역에 접근을 할 수 없다.
     *  public 으로 접근을 허용하는 설정자/접근자를 이용해 필드에 간접적으로 접근할 수 있도록 할 것이다.
     * */

    /* 필기.
     *  설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
     *  설정자(setter) 작성 규칙
     *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *  [표현식]
     *  public void set필드명(매개변수) {
     *      필드 = 매개변수;
     *  }
     *  [작성예시]
     *  public void setName(String name) {
     *      this.name = name;
     *  }
     * */

    /* 필기.
     *  접근자(getter) 작성 규칙
     *  : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *    각 접근자는 하나의 필드에만 접근하도록 한다.
     *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *  [표현식]
     *  public 반환형 get필드명() {
     *      return 반환값;
     *  }
     *  [작성예시]
     *  public void getName() {
     *      return this.name;
     *  }
     * */

    /*인텔리제이의 경우, Alt + Insert 단축키를 활용해 쉽게 작성할 수 있다.*/
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*필기. boolean타입의 필드는 getter 접근자를 생성해도 get이 아닌 is 나 has 등의 동사로 표현하는 것이 관례다.*/
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
