package com.ohgiraffers.section03.references;

import java.util.function.BiFunction;

public class Application1 {

    public static void main(String[] args) {

        /*목차. 1. 람다식으로 표현한 경우*/
        BiFunction<String, String, Boolean> biFunction;

        String str1 = "MATHOD";
        String str2 = "MATHOD";

        biFunction = (x, y) -> x.equals(y);
        //String 클래스의 equals라는 메소드 이름
        Boolean result = biFunction.apply(str1, str2);

        System.out.println("result = " + result);

        /*목차. 2. 메서드 참조로 표현한 경우*/
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);

        System.out.println("result = " + result);
    }
}
