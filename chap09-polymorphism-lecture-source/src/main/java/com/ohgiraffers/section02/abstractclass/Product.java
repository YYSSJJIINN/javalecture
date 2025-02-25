package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    /*설명. 추상클래스는 필드를 가질 수 있다.*/
    private int nonStaticField;
    private static int staticField;

    /*설명. 추상클래스는 기본생성자(매개변수가 없고, 클래스와 이름이 같다.)를 가질 수도 있다.
    * 하지만, 직접적으로 인스턴스를 생성할 수는 없다.
    * */
    public Product() {}

    /*설명. 추상클래스는 일반적인 메서드도 가질 수 있다.*/
    public void nonStaticMethod() {
        System.out.println("[Product] nonStaticMethod() 호출됨...");
    }

    public static void staticMethod() {
        System.out.println("[Product] staticMethod() 호출됨...");
    }

    /*설명.
    * 추가적으로 미완성 메서드(추상메서드) 또한 정의할 수 있다.
    * 추상 메서드가 0개일 경우, 선택적으로 클래스에 abstract 키워드를 작성해야 한다.
    * */
    public abstract void abstractMethod();
}
