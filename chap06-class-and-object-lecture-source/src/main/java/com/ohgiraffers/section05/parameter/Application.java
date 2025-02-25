package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 설명. 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있다. */

        /* 필기.
         *  매개변수(parameter)로 사용 가능한 자료형
         *  1. 기본자료형
         *  2. 기본자료형 배열
         *  3. 클래스자료형
         *  4. 클래스자료형 배열
         *  5. 가변인자
         * */

        ParameterTest pt = new ParameterTest();

        /*목차. 1. 기본자료형(8가지)*/
        int num = 20;
        pt.testPrimitiveTypeParam(num);

        /*목차. 2. 기본자료형 배열*/     //배열은 어차피 참조자료형 사용함
        int[] iArr = new int[] {10, 20, 30, 40, 50};
        pt.testPrimitiveTypeArrayParam(iArr);       //배열의 각 요소가 출력되는 것이 아닌 주소값이 출력됨.

        /*목차. 3. 클래스 자료형*/
        RectAngle r1 = new RectAngle(12.5, 22.5);
        pt.testClassTypeParam(r1);

        System.out.println("=========== 넓이/높이 변경 후===========");

        r1.calcArea();
        r1.calcRound();

        /*목차. 4. 클래스 자료형 배열 -> cahp07 객체 배열에서 다룰 예정이므로 스킵!*/

        /*목차. 5. 가변인자*/
        /*설명. 인자로 전달되는 값의 개수가 명확하게 지정되지 않은 경우, 가변 배열을 활용할 수 있다. */
//        pt.testVariableLengthArrayParam();      //
//        pt.testVariableLengthArrayParam("홍길동");
//        pt.testVariableLengthArrayParam("홍길동", "볼링", "축구");
        pt.testVariableLengthArrayParam("홍길동", "볼링", "축구", "테니스");
        //가변인자로 배열을 사용할 수도 있다.
        pt.testVariableLengthArrayParam("신사임당", new String[] {"테니스", "서예", "떡썰기"});

        /*설명. 가변인가 사용 시 주의사항 : 메서드 오버라이딩 시 조심해야 함.*/
        /* 설명.
         *  메소드를 오버라이딩하고 다시 돌아오면 위에 작성한 호출 구문에 컴파일에러가 발생한다.
         *  둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성(ambiguity)이 발생했기 때문에 에러가 나는 것이다.
         *  이렇게 가변배열을 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩 하지 않는 것이 좋다.
         * */
    }
}
