package com.ohgiraffers.section01.intro;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. 람다식에 대해 이해하고 사용할 수 있다.*/

        /* 필기.
         *  람다(lambda)식
         *  JDK 1.8에서 추가된 기능으로 메소드를 하나의 식(expression)으로 표현한 것이다.
         *  메소드를 람다식으로 표현하면 메소드 이름이 없는 익명함수(anonymous function)라고 할 수 있다.
         *  람다식은 알론조 처치 라는 수학자가 1936년에 발표한 람다 계산법에 기초하고 있다.
         *   Example ) f(x, y) = x * y
         *  위의 함수를 람다식으로 변경하면 아래와 같다
         *   Example) (x, y) -> x * y
         *
         * 필기.
         *  람다식을 사용하는 장점은 단순함이다.
         *  람다식을 활용하면 컬렉션, 스트림을 연계하여 데이터를 쉽게 조작할 수 있으며, 불필요하게 반복되는 코드도 제거할 수 있다.
         *  러닝커브가 존재하며, 객체지향 프로그래밍 사상에 위배되기 때문에 호불호가 갈리긴 하지만
         *  최근에는 람다와 스트림을 적극적으로 활용하는 추세이다.
         * */

        /* 필기.
         *  람다 표현식
         *  매개변수가 없는 경우
         *  () -> { ... }
         *
         * 필기.
         *  매개변수가 있는 경우
         *  (매개변수, ...) -> { ... }
         *
         * 필기.
         *  람다식에서 매개변수의 타입은 추론이 가능하기 때문에 명시적으로 작성하지 않아도 된다.
         *  또한 매개변수가 한 개만 존재하는 경우 ()를 생략할 수 있으며, 실행문이 한 줄인 경우 {}는 생략 가능하다.
         *  */

        /*필기.
        * 인터페이스에 정의된 추상메서드를 활용하기 위해서는 3가지 방법이 존재한다.
        * 1. 인터페이스를 상속받은 구형체 클래스를 정의해 기능을 완성시킨 후 사용하는 방법.
        * 2. 익명클래스를 활용해 메서드를 재정의한 후 사용하는 방법.
        * 3. 람다식을사용하는 방법.
        *    (나중을 위하여 3가지 방법 모두 알아둬야 함!
        * */

        /* 목차. 1. 인터페이스를 상속받은 구형체 클래스를 정의해 기능을 완성시킨 후 사용하는 방법.*/
        Calculator calc1 = new CalculatorImpl();    //new뒤에 오는건 구현체 클래스고, 앞에 있는건 인터페이스

        System.out.println("10과 20의 합은 ? : " + calc1.sumTwoNumber(10,20));

        /*목차. 2. 익명클래스를 활용해 메서드를 재정의한 후 사용하는 방법.*/
        /*설명. Calculator 인터페이스의 하위 구현체*/
        Calculator calc2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };

        System.out.println("20과 30의 합은? : " + calc2.sumTwoNumber(20, 30));

        /*목차. 3. 람다식을사용하는 방법.*/
        Calculator calc3 = (a, b) -> a + b;
        //원래 생김새 :  Calculator calc3 = (x, y) -> {return x + y};

        System.out.println("40과 50의 합은? : " + calc3.sumTwoNumber(40, 50));
    }
}