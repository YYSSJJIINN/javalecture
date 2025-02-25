package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private static int staticCount;
    //FIELD
    private int nonStaticCount;         //non-static 필드
    private static int StaticCount;     //static 필드

    //CONSTRUCTOR
    public StaticFieldTest() {

    }

    //Method
    /*설명. static 필드 접근하는 방법:
    * static 필드에 접근하기 위해서는 '클래스명.필드명'으로 접근해야 한다
    * 사실, 'this.필드명'으로 접근해도 에러는 발생하지 않지만, static 필드의 경우 this.을 사용하지 않는 것이 좋다.
    * */
    public int getNonStaticCount() {        //alt Insert Getter 컨트롤A로 전체선택
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return StaticFieldTest.staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount ++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }
}
