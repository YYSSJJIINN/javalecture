package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    //메서드 이름
//    @Override
//    public void method(int num) {}

    //메서드 리턴 타입
//    @Override
//    public int method(int num) {return 0;}

    //메서드 개수, 타입, 순서

//    @Override
//    public void method(String num) {}

    //접근제어자 private
//    @Override
//    private void privateMethod() {}

    //final
//    @Override
//    public final void finalMethod() {}

    //부모 메서드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩
    //public    (가장 넓음)     가능
    //protected                 가능
    //(default)                 불가능
    //private   (가장 좁음)     불가능
    @Override
    public void protectedMethod() {}

}
