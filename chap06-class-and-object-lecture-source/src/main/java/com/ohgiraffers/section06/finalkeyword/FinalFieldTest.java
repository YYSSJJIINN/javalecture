package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /* 수업목표. final 키워드에 대해 이해할 수 있다. */
    /* 필기.
     *  final
     *  : final은 종단의 의미를 가지는 키워드이다.
     *    final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경 불가의 의미이다.
     *    1. 지역변수 : 초기화 이후 값 변경 불가
     *    2. 매개변수 : 호출시 전달한 인자 변경 불가
     *    3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
     *    4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
     *    5. non-static 메소드 : 메소드 재작성(overriding) 불가
     *    6. static 메소드 : 메소드 재작성(overriding) 불가
     *    7. 클래스 : 상속 불가
     * */

    /*목차. 1. non-static field에 final 키워드 사용*/
    /*설명. final은 변경 불가의 의미를 갖는다.
    * 따라서 초기에 인스턴스가 생성된 이후 JVM이 정수를 다룰 때 초기화하는 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 동시에 바로 초기화 해줘야한다.
    * 그러지 않으면 컴파일 에러가 발생한다
    * ======================================================
    * 이를 해결할 수 있는 방법은 2가지가 있다:
    * 1. 선언과 동시에 초기화
    * 2. 생성자를 이용한 초기화
    *  */
//    private final int nonStaticNum;       //초기화가 안된 상태라 int의 기본값 0을 가지는데 이러면 존재할 필요가 없다

    /*목차. 1-1. 선언과 동시에 초기화*/
    private final int NON_STATIC_NUM = 1;

    /*목차. 1-2. 생성자를 이용한 초기화*/
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String NON_STATIC_NAME) {     //Alt Insert의 constructor사용
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    /*목차. 2. static field에 final 키워드 사용*/
//    private static final int STATIC_NUM;      //0으로 초기화 된 후 값을 변경할 수가 없어서 컴파일 에러 발생.

    //선언과 동시에 초기화
    private static final int STATIC_NUM = 1;

    //생성자를 이용한 초기화 -> 불가능     생성자는 new만나서 런타임 시기에만 의미가 있다
    private static final double STATIC_DOUBLE;
    /*설명. 생성자를 이용한 초기화는 불가능하다.
    * 생성자는 인스턴스가 생성되는(new) 시점에 호출되는 메서드이기 때문에 그 이전에는 초기화를 진행할 수 없다.
    * 하지만 static은 프로그램이 Start 할 때 비로소 할당되기 때문에 초기화가 안된 상태로 선언된 것과 동일하여
    * 기본값으로 초기화된 후 값을 변경하지 못하는 똑같은 상황에 놓이기 때문에 에러가 발생한다.
    * 즉, 시간 순서상 말이 안되는 로직이다.*/

    /*설명. 하지만, 초기화 블럭으로는 초기화 할 수 있다.
    * 지금 이렇게 사용 가능하겠구나 정도로만 알아두고, 필드에 대해 좀 더 정리한 뒤 초기화 블럭에 대해 다시 살펴볼 예정이다.*/
    static{
        STATIC_DOUBLE = 1.5;
    }
}
