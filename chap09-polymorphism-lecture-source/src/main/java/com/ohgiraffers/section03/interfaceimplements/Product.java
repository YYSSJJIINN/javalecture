package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

/*설명
* 클래스에서 인터페이스를 '상속'받는다는 표현 대신 '구현'한다는 표현을 사용한다.
* 따라서 extends 키워드 대신에 implements키워드를 사용하면 된다.
* 하나의 클래스에서 인터페이스는 여러개를 구현할 수 있으며,
* 하나의 클래스는 다른 하나의 클래스를 상속받으면서 동시에 여러개의 인터페이스를 구현할 수 있다.
* 단, 이 때 extends 키워드를 먼저 사용하고 그 후에 implements 키워드를 사용해야 한다.
* */
public class Product extends Object implements InterProduct, Serializable {

    /*설명
    * InterProduct를 구현하자 마자 해당 인터페이스가 가지고 있는 추상 메서드를 오버라이딩 해야하는
    * 강제성이 부여되기 때문에 인터페이스에 작성된 추상 메서드를 반드시 모두 오버라이딩 해야 에러가 사라진다.*/
    @Override
    public void nonStaticMethod() {
        System.out.println("[Product] InterProduct의 nonStaticMethod() 오버라이딩...");
    }

    @Override
    public void abstMethod() {
        System.out.println("[Product] InterProduct의 abstMethod() 오버라이딩...");
    }

    /*필기. static 메서드는 구현체 측에서 오버라이딩 할 수 없다.*/

    /*필기. default 키워드를 제외하면 오버라이딩 가능하지만, 제외하지 않으면 에러가 발생한다.*/
    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();
    }
}
