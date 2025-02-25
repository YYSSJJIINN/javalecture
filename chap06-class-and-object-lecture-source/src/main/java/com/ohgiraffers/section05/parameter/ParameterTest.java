package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimitiveTypeParam(int num) {
        System.out.println("전달인자로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParam(int[] iArr) {
        System.out.println("전달인자로 전달받은 값 : " + iArr);
    }

    public void testClassTypeParam(RectAngle rectAngle) {

        System.out.println("전달인자로 전달받은 값 : " + rectAngle);

        System.out.println("============ #1 넓이/길이 ============");
        rectAngle.calcArea();
        rectAngle.calcRound();

        //사각형의 넓이와 높이를 변경
        rectAngle.calcArea();
        rectAngle.calcRound();

        System.out.println("============ #2 넓이/길이 ============");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArrayParam(String name, String... hobbies) {
        System.out.println("전달인자로 전달받은 name : " + name);
        System.out.println("전달인자로 전달받은 hobbies의 길이 : " + hobbies.length);

        System.out.print("전달인자로 전달받은 취미 : [");
        for(int i = 0; i < hobbies.length; i++){
            System.out.println(hobbies[i] + " ");
        }
    System.out.println("]");
    }

    /*오버라이딩 시 주의!*/
//    public void testVariableLengthArrayParam(String... hobbies) {
//        System.out.println("전달인자로 전달받은 hobbies의 길이 : " + hobbies.length);
//
//        System.out.print("전달인자로 전달받은 취미 : [");
//        for(int i = 0; i < hobbies.length; i++){
//            System.out.println(hobbies[i] + " ");
//        }
//        System.out.println("]");
//    }
}

