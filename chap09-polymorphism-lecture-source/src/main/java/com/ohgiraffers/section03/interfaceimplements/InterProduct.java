package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;
/*설명.
* 인터페이스는 또 다른 인터페이스를 상속받을 수 있다.
* 그러나 여전히 여러개의 인터페이스를 다중 상속 받을 수는 없다.*/
public interface InterProduct extends Serializable {

    /*설명. 인터페이스는 상수필드만 가질 수 있다.
    * 상수 필드란, public static final 제어자 조합을 가진 필드를 말한다.
    * 따라서 반드시 선언과 동시에 초기화 해줘야한다.*/
    public static final int MAX_NIM = 100;     //컴파일러가 알아서 암묵적으로 static 넣어줌

    /*설명. 상수 필드만 가질 수 있게 설계되었기 때문에
    * 인터페이스의 모든 필드는 묵시적으로 public static final이 선언된다.
    * */
    int MIN_NUM = 10;

    /*필기.인터페이스는 생성자를 가질 수 없다.*/
//    public InterProduct() {}

    /*필기. 인터페이스는 구현부(body)={괄호}가 존재하는 non-static 메서드를 가질 수 없다.*/
//    public void nonStaticMethod() {}

    /*필기. 인터페이스는 추상메서드만 가질 수 있다.*/
    public abstract void nonStaticMethod();

    /*필기.
    * 상수필드와 마찬가지로 인터페이스 내 작성한 메서드는 모두 public abstract가 묵시적으로 작성된다.
    * (다른 접근 제한자 사용 불가능)
    * 따라서 인터페이스의 메서드를 오버라이딩 하는 경우 반드시 접근제한자를 public으로 설계해야 오버라이딩이 가능하다.
    * */
    void abstMethod();      //인터페이스는 묵시적으로 public abstract를 알아서 적어준다.

    /*필기. 하지만, static 메서드는 작성 가능하다.*/
    public static void staticMethod() {
        System.out.println("[InterProduct] staticMethod 호출됨");
    }

    /*필기. default 키워드 사용하면 non-static 메서드로 작성 가능하다.*/
    public default void defaultMethod() {
        System.out.println("[InterProduct] defaultMethod 호출됨");
    }

}
