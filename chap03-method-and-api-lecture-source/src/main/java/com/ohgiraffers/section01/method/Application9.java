package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메서드를 호출할 수 있다.*/
        
//       main 메서드에서 사용할 지역변수 선언 및 초기화(=동시 초기화)
        int first = 100;
        int second = 50;    //50이 전달인자인 argument
        
        /* 목차. 1. 다른 클래스 Calculator의 non-static 메서드 호출*/
        Calculator calc = new Calculator();     //클래스명 변수명 = new 클래스명
        int min = calc.minNumberOf(first, second);

        System.out.println("min = " + min);

        /* 목차. 2. static 메서드 호출*/ //특징: new 적혀있는거 안적어도 된다.
        int max = Calculator.maxNumberOf(first, second);

        System.out.println("max = " + max);

        /*주의 사항.
        *  static 메서드도 non-static 메서드처럼 호출할 수는 있다.
        *  컴파일 에러를 발생시키지는 않지만, 권장 되는 방식은 아니기 때문에 경고를 준다.
        *  이미 메모리에 로딩되어 있는 static 메서드는 여러 객체가 공유하게 된다.
        *  그 때, 객체로 접근하게 되면, 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문에
        * 사용을 제한해달라는 경고다.
        *  시스템이 복잡해지고 커질 수록 객체의 상태를 추적하기 어려워 유지 보수에 악영향을 준다.*/
        int max2 = calc.maxNumberOf(first, second);
        System.out.println("max2 = " + max2);
    }
}
