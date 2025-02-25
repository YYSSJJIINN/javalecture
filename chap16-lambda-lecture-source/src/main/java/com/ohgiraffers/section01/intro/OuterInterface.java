package com.ohgiraffers.section01.intro;

public interface OuterInterface {   //외부메서드와

    //내부 메서드들
    @FunctionalInterface
    public interface Addition {
        int addTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Substraction {
        int subTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiplication {
        int mulTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Division {
        int divTwoNumber(int a, int b);
    }

}
