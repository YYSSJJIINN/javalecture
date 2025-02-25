package com.ohgiraffers.section01.method;

public class Calculator {

//    non-static method
    public int minNumberOf(int first, int second) {
        return (first < second) ? first : second;
    }

//    static method
    public static int maxNumberOf(int first, int second) {
        return (first < second) ? second : first;
    }
}
