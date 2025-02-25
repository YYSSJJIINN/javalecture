package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;       //길이(밑변)
    private double height;      //높이

    /*설명. 기본생성자 없이 매개변수 있는 생성자를 만든 이유:
    * 기본 생성자를 이용하면 길이와 높이가 각각 0.0인 직사각형이 생성될 가능성이 생긴다.
    * 그러나 길이와 높이가 0이라는 직사각형 및 2차원 평면 도형은 현실 세계에서 존재할 수 없는 것이다.
    * 따라서 기본생성자를 고의로 생략한 후, 매개변수 있는 생성자를 작성하여
    * 사용자 측에서 직사각형이라는 객체를 만들 때 길이와 높이를 반드시 입력하도록 강제한다
    * */
    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea() {    //같은 클래스에 재료가 다 있으므로 매개변수 안넣어줘도 된다

        double area = width * height;
        System.out.println("이 직사각형의 넓이는 " + area + "입니다.");
    }

    public void calcRound() {
        double round = (width + height) * 2;
        System.out.println("이 직사각형의 둘레는 " + round + " 입니다.");
    }
}
