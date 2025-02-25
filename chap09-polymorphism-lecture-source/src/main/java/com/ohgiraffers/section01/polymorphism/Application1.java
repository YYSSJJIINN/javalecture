package com.ohgiraffers.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        /* 필기.
         *  다형성
         *  다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
         *  그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
         *  하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 할 수도 있다.
         *
         * 필기.
         *  다형성은 객체지향 프로그래밍의 3대 특징 (캡슐화, 상속, 다형성) 중 하나이며,
         *  객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
         *  하지만 학습하기 어렵다는 단점을 가지고 있다.
         * */

        /* 필기.
         *  다형성의 장점
         *  1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         *  2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         *     이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         *     (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
         *     하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         *     다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
         *     하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         *  3. 확장성이 좋은 코드를 작성할 수 있다.
         *  4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         * */

        /* 설명.
         *  하지만 다형성은 장점이 잘 와닿지도 않고 개념도 정말 많이 어렵다.
         *  철학적인 부분과 설계적인 부분보다 우선 다형성의 문법적 특징에 집중해서 학습하도록 하자
         * */

        /* 설명.
         *  우선적으로 살펴볼 것은 다형성이란 서로 다른 형태를 가지고 있는 성질을 의미한다는 것이다.
         *  다형성은 상속을 기반으로 하는 기술이다.
         *  상속은 부모클래스가 가지는 속성과 기능(필드와 메소드)를 물려받아 자신의 것 처럼 사용하며
         *  확장도 가능한 개념이라고 했다.
         *  하지만 이 때 물려받는 것이 한 가지 더 있다. 바로 타입이다.
         *  클래스는 사용자 정의의 타입이다. 이렇게 사용자가 정의한 타입 또한 함께 물려받는 것이
         *  다형성이 서로 다른 여러 형태를 가지고 있다는 개념이다.
         *
         * 설명.
         *  Car 클래스와 FireCar, RacingCar를 기억하는가?
         *  FireCar는 FireCar 이면서 Car 이기도 하다.
         *  RacingCar 역시 RacingCar 이기도 하면서 Car이기도 하다
         *  FireCar와 RacingCar로 생성한 인스턴스는 각각 FireCar, RacingCar 타입이라고 볼 수 있다.
         *  하지만 FireCar와 RacingCar 모두 Car라는 타입도 함께 가지고 있다.
         *  이것이 서로 다른 타입을 여러 개 가지고 있다는 의미이다.
         *  */

        System.out.println("===== 1. Animal 인스턴스 생성 =====");
        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();
        System.out.println("===== 2. Rabbit 인스턴스 생성 =====");
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();
        System.out.println("===== 3. Tiger 인스턴스 생성 =====");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        /*설명.
        * Rabbit과 Tiger는 Animal 클래스를 상속받았다.
        * 따라서 Rabbit은 Rabbit타입이기도 하면서 Animal타입이기도 하며,
        * Tiger는 Tiger타입이기도 하면서 Animal 타입이기도 하다.
        * */

        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        /*설명.
        * Animal은 Animal 타입일 뿐, Rabbit 타입도 아니고 Tiger타입도 아니다.
        * 따라서 아래는 컴파일 에러가 발생한다.*/
//        Rabbit r = new Animal();
//        Tiger t = new Animal();

        /*필기. 동적 바인딩(dynamic binding):
        * 컴파일 타임 시에는 해당 타입의 메서드와 연결되어 있다가,
        * 런타임 시에 실제 객체가 가진 오버라이딩된 메서드로 바인딩이 바뀌어 동작하는 것을 의미한다.
        * */
        System.out.println("========== 동적 바인딩 확인 ==========");//가리킨다 = 바인더
        a1.cry();
        a2.cry();

        /*필기
        * 하지만, 컴파일 타임에는 a1과 a2 인스턴스는 Animal 타입으로 판정되기 때문에
        * Rabbit의 jump()와 Tiger의 bite()는 참조할 수 없고
        * Rabbit과 Tiger가 가지고 있는 고유한 기능을 동작시킬 수 없다.*/
//        a1.jump();      //런타임 전인 컴파일 타임임으로 animal에 바인딩 되어 있음
//        a2.bite();      //마찬가지로 tiger가 아니라 animal에 바인딩 되어있음

        /*필기. 타입 형변환:
        * 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스 변수를 형변환하여 각각 Rabbit과 Tiger로 변경한 뒤 메서드를 호출해야 한다.
        * 이를 클래스 형변환(Class type casting)이라고 하며,
        * 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않은 경우 ClassCastException 예외가 발생할 수 있다.*/
        System.out.println("========== 클래스 형변환 확인 ==========");
//        a1.jump(); //을
        ((Rabbit) a1).jump();
//        a2.bite(); //을
        ((Tiger) a2). bite();
//        ((Tiger) a1). bite();     //런타임 에러 -> 토끼는 호랑이가 될 수 없다. new 연산자로 a1이 rabbit이 되는 것은 런타임 이후이기에 컴파일타임때까지는 인텥리가 오류를 못잡음

        /*필기. instanceof 비교연산자:
        * 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 같은지 비교하는 연산자.
        * */
        System.out.println("========== instanceof 연산자 확인 ==========");
        System.out.println("a1이 Tiger 타입인가? = " + (a1 instanceof Tiger));       //false
        System.out.println("a1이 Rabbit 타입인가? = " + (a1 instanceof Rabbit));     //true
        System.out.println("a1이 Animal 타입인가? = " + (a1 instanceof Animal));     //true
        System.out.println("a1이 Object 타입인가? = " + (a1 instanceof Object));     //true

        if(a1 instanceof Rabbit) {
            ((Rabbit) a1).jump();
            System.out.println("런타임 때 알고보니 a1은 Rabbit 타입이 되더라~");
        }
        //이렇게 조건문과 instanceof 연산자의 조합으로 행여 발생할 수 있는 런타임 타입에러를 방지할 수 있다.
        if(a1 instanceof Tiger) {
            ((Tiger) a1).bite();
            System.out.println("런타임 때 알고보니 a1은 Tiger 타입이 되더라~");
        }

        /*필기. 클래스 업캐스팅 및 다운캐스팅:
        * 클래스 형변환은 Up-casting과 Down-casting으로 나눌 수 있다.
        * - Up-casting : 상위 타입으로 형변환
        * - Down-casting : 하위 타입으로 형변환
        * 또한 형변환 문법() 작성 여부에 따라 명시적 형변환과 묵시적 형변환 두 가지로도 나눌 수 있다.
        * */
        System.out.println("========== 클래스 업/다운 캐스팅 ==========");
        Animal animal1 = (Animal) new Rabbit();     //Up-casting + 명시적(강제) 형변환
        Animal animal2 = new Rabbit();              //Up-casting + 묵시적(자동) 형변환

        Rabbit rabbit1 = (Rabbit) animal1;          //애니멀이 래빗이 되겠다=Down-casting + 명시적(강제) 형변환
//        Rabbit rabbit2 = animal2;                   //Down-casting + 묵시적 형변환 안됨(강제 형변환으로만 가능)
    }
}
